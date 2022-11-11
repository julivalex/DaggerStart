package com.example.daggerstart.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.daggerstart.R
import com.example.daggerstart.example2.ExampleApp
import com.example.daggerstart.example2.di.ActivityComponent
import javax.inject.Inject

class MainActivity2 : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel: ExampleViewModel by viewModels { viewModelFactory }

    private val viewModel2: ExampleViewModel2 by viewModels { viewModelFactory }

    private val component: ActivityComponent by lazy {
        (application as ExampleApp)
            .component
            .activityComponentFactory()
            .create("MY_ID_2", "MY_NAME_2")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
        viewModel2.method()
    }
}