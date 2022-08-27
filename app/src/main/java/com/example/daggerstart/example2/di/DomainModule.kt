package com.example.daggerstart.example2.di

import com.example.daggerstart.example2.data.repository.ExampleRepositoryImpl
import com.example.daggerstart.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
abstract class DomainModule {

    @Binds
    abstract fun bindExampleRepository(impl: ExampleRepositoryImpl): ExampleRepository
}