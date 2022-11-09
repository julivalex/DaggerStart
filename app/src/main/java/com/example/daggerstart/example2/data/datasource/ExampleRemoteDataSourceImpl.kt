package com.example.daggerstart.example2.data.datasource

import com.example.daggerstart.example2.data.datasource.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}
