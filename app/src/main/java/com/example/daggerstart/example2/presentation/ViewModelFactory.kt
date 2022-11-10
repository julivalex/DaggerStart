package com.example.daggerstart.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.daggerstart.example2.domain.ExampleRepository
import com.example.daggerstart.example2.domain.ExampleUseCase
import javax.inject.Inject

class ViewModelFactory @Inject constructor(
    private val exampleUseCase: ExampleUseCase,
    private val repository: ExampleRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass == ExampleViewModel::class.java) {
            return ExampleViewModel(exampleUseCase) as T
        }
        if (modelClass == ExampleViewModel2::class.java) {
            return ExampleViewModel2(repository) as T
        }
        throw RuntimeException("Unknown view model class $modelClass")
    }
}