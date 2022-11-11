package com.example.daggerstart.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.daggerstart.R
import com.example.daggerstart.example2.ExampleApp
import javax.inject.Inject

class MainActivity2 : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    //private val viewModel = ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]

    private val viewModel: ExampleViewModel by viewModels { viewModelFactory }

    private val viewModel2: ExampleViewModel2 by viewModels { viewModelFactory }

    private val component by lazy {
        (application as ExampleApp).component
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
        viewModel2.method()
    }
}