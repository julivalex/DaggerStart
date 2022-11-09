package com.example.daggerstart.example2.data.datasource.network

import android.content.Context
import android.util.Log
import com.example.daggerstart.R
import com.example.daggerstart.example2.di.ApplicationScope
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService ${context.getString(R.string.app_name)} $timeMillis $this")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
