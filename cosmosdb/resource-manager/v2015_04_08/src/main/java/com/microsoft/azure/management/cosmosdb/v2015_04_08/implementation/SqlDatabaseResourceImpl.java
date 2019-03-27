/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

import com.microsoft.azure.management.cosmosdb.v2015_04_08.SqlDatabaseResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.SqlDatabaseCreateUpdateParameters;
import java.util.Map;
import rx.functions.Func1;

class SqlDatabaseResourceImpl extends CreatableUpdatableImpl<SqlDatabaseResource, SqlDatabaseResourceInner, SqlDatabaseResourceImpl> implements SqlDatabaseResource, SqlDatabaseResource.Update {
    private final DocumentDBManager manager;
    private String resourceGroupName;
    private String accountName;
    private String databaseRid;
    private SqlDatabaseCreateUpdateParameters updateParameter;

    SqlDatabaseResourceImpl(String name, DocumentDBManager manager) {
        super(name, new SqlDatabaseResourceInner());
        this.manager = manager;
        // Set resource name
        this.databaseRid = name;
        //
        this.updateParameter = new SqlDatabaseCreateUpdateParameters();
    }

    SqlDatabaseResourceImpl(SqlDatabaseResourceInner inner, DocumentDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.databaseRid = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "databaseAccounts");
        this.databaseRid = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        //
        this.updateParameter = new SqlDatabaseCreateUpdateParameters();
    }

    @Override
    public DocumentDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SqlDatabaseResource> createResourceAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<SqlDatabaseResource> updateResourceAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return client.updateSqlDatabaseAsync(this.resourceGroupName, this.accountName, this.databaseRid, this.updateParameter)
            .map(new Func1<SqlDatabaseResourceInner, SqlDatabaseResourceInner>() {
               @Override
               public SqlDatabaseResourceInner call(SqlDatabaseResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SqlDatabaseResourceInner> getInnerAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new SqlDatabaseCreateUpdateParameters();
    }

    @Override
    public String _colls() {
        return this.inner()._colls();
    }

    @Override
    public String _etag() {
        return this.inner()._etag();
    }

    @Override
    public String _rid() {
        return this.inner()._rid();
    }

    @Override
    public String _self() {
        return this.inner()._self();
    }

    @Override
    public Object _ts() {
        return this.inner()._ts();
    }

    @Override
    public String _users() {
        return this.inner()._users();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String sqlDatabaseResourceId() {
        return this.inner().sqlDatabaseResourceId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
