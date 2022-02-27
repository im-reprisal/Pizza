package com.masai.orderPizza.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.masai.orderPizza.CartApplication
import com.masai.orderPizza.R
import com.masai.orderPizza.data.local.MyEntity
import com.masai.orderPizza.data.models.Crust
import com.masai.orderPizza.data.repository.PizzaRepository
import com.masai.orderPizza.interfaces.ItemListener
import com.masai.orderPizza.network.ApiService
import com.masai.orderPizza.network.ServiceGenerator
import com.masai.orderPizza.ui.adapter.PizzaAdapter
import com.masai.orderPizza.ui.viewmodel.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ItemListener {

    lateinit var pizzaViewModel: PizzaViewModel
    lateinit var pizzaAdapter: PizzaAdapter
    private val pizzaResponse = mutableListOf<Crust>()
    private lateinit var viewModel: CartViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pizzaAdapter = PizzaAdapter(pizzaResponse, this)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = pizzaAdapter

        val pizzaApiService = ServiceGenerator.getInstance().create(ApiService::class.java)
        val repository = PizzaRepository(pizzaApiService)

        pizzaViewModel = ViewModelProvider(
            this,
            PizzaViewModelFactory(repository)
        ).get(PizzaViewModel::class.java)
        pizzaViewModel.pizzas.observe(this, Observer {
            pizzaAdapter.PizzaList = it.crusts!!

            pizzaAdapter.notifyDataSetChanged()
        })

        val appObj = application as CartApplication
        val cartRepository = appObj.repository
        val viewModelFactory = CartViewModelFactory(cartRepository)
        viewModel = ViewModelProviders.of(this, viewModelFactory)
            .get(CartViewModel::class.java)

        button_cart.setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }
    }

    override fun addCartItems(name: String, size: String, crust: String, price: Double) {
        val myEntity = MyEntity(name, size, crust, price)
        viewModel.addItems(myEntity)
   }
}
