package com.example.daggerstart.example2.data.datasource

import com.example.daggerstart.example2.data.datasource.database.ExampleDatabase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}
