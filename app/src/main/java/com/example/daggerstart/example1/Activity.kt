package com.example.daggerstart.example1

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var keyboard: Keyboard

    val mouse = DaggerNewComponent.create().getMouse()

    init {
        DaggerNewComponent.create().inject(this)
    }
}