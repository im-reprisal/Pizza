package com.masai.orderPizza.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.masai.orderPizza.data.repository.PizzaRepository

class PizzaViewModelFactory(private val repository: PizzaRepository): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PizzaViewModel(repository) as T
    }
}