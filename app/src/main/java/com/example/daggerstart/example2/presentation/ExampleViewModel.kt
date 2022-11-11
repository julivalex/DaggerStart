package com.example.daggerstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.daggerstart.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
): ViewModel() {

    fun method() {
        useCase()
        Log.d(LOG_TAG, "ExampleViewModel: $this")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST2"
    }
}
