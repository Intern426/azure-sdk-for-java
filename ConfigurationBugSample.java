package com.azure.app;

import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.data.appconfiguration.ConfigurationAsyncClient;
import com.azure.data.appconfiguration.credentials.ConfigurationClientCredentials;
import com.azure.data.appconfiguration.models.ConfigurationSetting;
import com.azure.data.appconfiguration.models.SettingSelector;
import com.azure.storage.blob.StorageAsyncClient;
import com.azure.storage.blob.StorageClient;
import com.azure.storage.common.credentials.SharedKeyCredential;
import reactor.core.publisher.Mono;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public class ConfigurationBugSample {
    private static final String AZURE_APP_CONFIG = "Endpoint=https://bookinventory.azconfig.io;Id=0-l1-s0:4QJGUxmhEpiHg9FhMzDd;Secret=1akyB7rK7/zKVwrMUdiC7Xt7GdfM7JPM5w421txLCPM=";
    private Mono<StorageAsyncClient> storageClient;

    /**
     * Sets up the Configuration AsyncClient and the StorageAsync Client
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     */
    public ConfigurationBugSample() throws NoSuchAlgorithmException, InvalidKeyException {
        ConfigurationAsyncClient client;
        try {
            client = ConfigurationAsyncClient.builder()
                .credentials(new ConfigurationClientCredentials(AZURE_APP_CONFIG))
                .httpLogDetailLevel(HttpLogDetailLevel.HEADERS)
                .build();
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            System.err.println("AZURE_APP_CONFIG is not set properly. Cannot connect to App Configuration."
                + " Please set it.");
            throw (e);
        }
        SettingSelector keys = new SettingSelector().keys("BLOB*");
        storageClient = client.listSettings(keys).collectList().map(list -> {
            String accountName = null;
            String accountKey = null;
            String url = null;
            for (ConfigurationSetting configurationSetting : list) {
                String key = configurationSetting.key();
                if (key.contentEquals("BLOB_ACCOUNT_NAME")) {
                    accountName = configurationSetting.value();
                } else if (key.contentEquals("BLOB_KEY")) {
                    accountKey = configurationSetting.value();
                } else {
                    url = configurationSetting.value();
                }
            }
            SharedKeyCredential credential = new SharedKeyCredential(accountName, accountKey);
            String endPoint = String.format(Locale.ROOT, url);
            return StorageClient.storageClientBuilder()
                .endpoint(endPoint)
                .credential(credential)
                .httpLogDetailLevel(HttpLogDetailLevel.HEADERS)
                .buildAsyncClient();
        });
    }

    private Mono<Void> callConfiguration() {
        return storageClient.map(client -> {
            //do something/or just return client
            //return client.listSettings();
            return client;
        }).then();
    }

    /**
     * Sample code that calls App Configuration multiple times using a StorageAsyncClient
     */
    public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException {
        ConfigurationBugSample bug = new ConfigurationBugSample();
        for (int i = 0; i < 15; i++) {
            bug.callConfiguration().block();
        }
    }
}
