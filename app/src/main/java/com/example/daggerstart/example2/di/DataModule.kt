package com.example.daggerstart.example2.di

import com.example.daggerstart.example2.data.datasource.ExampleLocalDataSource
import com.example.daggerstart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.daggerstart.example2.data.datasource.ExampleRemoteDataSource
import com.example.daggerstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}