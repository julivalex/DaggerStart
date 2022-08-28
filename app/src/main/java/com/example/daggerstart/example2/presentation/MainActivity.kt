package com.example.daggerstart.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TimeUtils
import com.example.daggerstart.R
import com.example.daggerstart.example2.di.DaggerApplicationComponent
import java.sql.Time
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        DaggerApplicationComponent
            .factory()
            .create(application, System.currentTimeMillis())

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}