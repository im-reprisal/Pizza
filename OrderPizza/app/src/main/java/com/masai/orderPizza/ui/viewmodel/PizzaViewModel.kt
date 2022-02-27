package com.masai.orderPizza.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.masai.orderPizza.data.models.PizzaResponse
import com.masai.orderPizza.data.repository.PizzaRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PizzaViewModel(val repository: PizzaRepository): ViewModel() {

    init {
        viewModelScope.launch (Dispatchers.IO){
            repository.getPizza()
        }
    }
    val pizzas: LiveData<PizzaResponse>
        get() = repository.pizzas


}