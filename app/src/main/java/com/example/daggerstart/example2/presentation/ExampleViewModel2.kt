package com.example.daggerstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.daggerstart.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository
): ViewModel() {

    fun method() {
        repository.method()
        Log.d(LOG_TAG, "ExampleViewModel2: $this")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST2"
    }
}
