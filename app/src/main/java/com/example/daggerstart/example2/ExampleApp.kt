package com.example.daggerstart.example2

import android.app.Application
import com.example.daggerstart.example2.di.DaggerApplicationComponent

class ExampleApp : Application() {

    val component by lazy {
        DaggerApplicationComponent
            .factory()
            .create(this, System.currentTimeMillis())
    }
}