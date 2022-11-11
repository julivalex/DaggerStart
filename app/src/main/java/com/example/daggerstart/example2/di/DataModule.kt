package com.example.daggerstart.example2.di

import com.example.daggerstart.example2.data.datasource.ExampleLocalDataSource
import com.example.daggerstart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.daggerstart.example2.data.datasource.ExampleRemoteDataSource
import com.example.daggerstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import com.example.daggerstart.example2.data.datasource.TestRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ProdQualifier
    @ApplicationScope
    @Binds
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestQualifier
    @ApplicationScope
    @Binds
    fun bindTestRemoteDataSource(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource
}