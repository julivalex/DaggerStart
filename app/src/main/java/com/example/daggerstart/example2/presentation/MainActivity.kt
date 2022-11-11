package com.example.daggerstart.example2.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import com.example.daggerstart.R
import com.example.daggerstart.example2.ExampleApp
import com.example.daggerstart.example2.di.ActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel: ExampleViewModel by viewModels { viewModelFactory }

    private val viewModel2: ExampleViewModel2 by viewModels { viewModelFactory }

    private val component: ActivityComponent by lazy {
        (application as ExampleApp).component
            .activityComponentFactory()
            .create("MY_ID_1")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
        viewModel2.method()

        findViewById<TextView>(R.id.tv_hello_world).setOnClickListener {
            Intent(this, MainActivity2::class.java).apply {
                startActivity(this)
            }
        }
    }
}