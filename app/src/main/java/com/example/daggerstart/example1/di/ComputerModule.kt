package com.example.daggerstart.example1.di

import com.example.daggerstart.example1.Monitor
import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideMonitor() = Monitor()
}