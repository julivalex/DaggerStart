package com.example.daggerstart.example1.di

import com.example.daggerstart.example1.Computer
import com.example.daggerstart.example1.ComputerTower
import com.example.daggerstart.example1.Keyboard
import com.example.daggerstart.example1.Memory
import com.example.daggerstart.example1.Monitor
import com.example.daggerstart.example1.Mouse
import com.example.daggerstart.example1.Processor
import com.example.daggerstart.example1.Storage
import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideMonitor() = Monitor()


    @Provides
    fun provideKeyboard() = Keyboard()


    @Provides
    fun provideMouse() = Mouse()

    @Provides
    fun provideStorage() = Storage()

    @Provides
    fun provideMemory() = Memory()

    @Provides
    fun provideProcessor() = Processor()

    @Provides
    fun provideComputerTower(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ) = ComputerTower(storage, memory, processor)

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse
    ) = Computer(monitor, computerTower, keyboard, mouse)
}