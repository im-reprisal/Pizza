package com.masai.orderPizza.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.masai.orderPizza.data.local.MyEntity
import com.masai.orderPizza.data.repository.CartRepository

class CartViewModel(private val repository: CartRepository) : ViewModel() {

    fun addItems(taskEntity: MyEntity) {
        repository.addItems(taskEntity)
    }

    fun getItems(): LiveData<List<MyEntity>> {
        return repository.getItems()
    }
    fun totalPrice(): LiveData<Double> {
        return repository.totalPrice()
    }
}