package com.masai.orderPizza.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.masai.orderPizza.data.models.PizzaResponse
import com.masai.orderPizza.network.ApiService

class PizzaRepository(private val pizzaApiService:ApiService) {
    private val pizzaLiveData= MutableLiveData<PizzaResponse>()

    val pizzas: LiveData<PizzaResponse>
        get() = pizzaLiveData

    suspend fun getPizza(){
        val result= pizzaApiService.getPizza()
        if (result?.body()!=null){
            pizzaLiveData.postValue(result.body())

        }
    }
}