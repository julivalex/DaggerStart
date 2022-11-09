package com.example.daggerstart.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggerstart.R
import com.example.daggerstart.example2.ExampleApp

class MainActivity : AppCompatActivity() {

    private val component by lazy {
        (application as ExampleApp).component
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        //component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "${component.getExampleViewModel()}")
        Log.d("MainActivity", "${component.getExampleViewModel()}")
        Log.d("MainActivity", "${component.getExampleDatabase()}")
        Log.d("MainActivity", "${component.getExampleDatabase()}")
        Log.d("MainActivity", "${component.getExampleApiService()}")
        Log.d("MainActivity", "${component.getExampleApiService()}")
        //viewModel.method()
    }
}