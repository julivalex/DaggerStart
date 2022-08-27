package com.example.daggerstart.example1.di

import com.example.daggerstart.example1.Activity
import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {

    fun inject(activity: Activity)
}