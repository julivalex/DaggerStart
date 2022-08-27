package com.example.daggerstart.example1

import com.example.daggerstart.example1.di.DaggerNewComponent
import javax.inject.Inject

class Activity {

    @Inject
    lateinit var computer: Computer

    init {
        DaggerNewComponent.create().inject(this)
    }
}