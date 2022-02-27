package com.masai.orderPizza.data.repository

import androidx.lifecycle.LiveData
import com.masai.orderPizza.data.local.MyDao
import com.masai.orderPizza.data.local.MyEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CartRepository(private val myDao: MyDao) {

    fun addItems(myEntity: MyEntity){
        CoroutineScope(Dispatchers.IO).launch {
            myDao.insertItems(myEntity)
        }
    }
    fun getItems(): LiveData<List<MyEntity>> {
        return myDao.getItems()
    }
    fun totalPrice(): LiveData<Double> {
        return myDao.totalPrice()
    }
}