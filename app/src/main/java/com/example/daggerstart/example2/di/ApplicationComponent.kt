package com.example.daggerstart.example2.di

import android.content.Context
import com.example.daggerstart.example2.data.datasource.database.ExampleDatabase
import com.example.daggerstart.example2.data.datasource.network.ExampleApiService
import com.example.daggerstart.example2.presentation.ExampleViewModel
import com.example.daggerstart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
           @BindsInstance context: Context,
           @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }

    fun inject(activity: MainActivity)
}