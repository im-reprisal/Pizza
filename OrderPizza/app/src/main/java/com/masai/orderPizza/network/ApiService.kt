package com.masai.orderPizza.network

import com.masai.orderPizza.data.models.PizzaResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("Pizza%2520json")
    suspend fun getPizza(): Response<PizzaResponse>
}