package com.masai.orderPizza

import android.app.Application
import com.masai.orderPizza.data.local.MyDatabase
import com.masai.orderPizza.data.repository.CartRepository

class CartApplication : Application() {
    private val myDao by lazy {
        val roomDatabase = MyDatabase.getDatabase(this)
        roomDatabase.getMyDao()
    }
    val repository: CartRepository by lazy {
        CartRepository(myDao)
    }
}