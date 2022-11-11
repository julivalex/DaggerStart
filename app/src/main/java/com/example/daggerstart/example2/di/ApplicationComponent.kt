package com.example.daggerstart.example2.di

import android.content.Context
import com.example.daggerstart.example2.presentation.MainActivity
import com.example.daggerstart.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun activityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
           @BindsInstance context: Context,
           @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }
}