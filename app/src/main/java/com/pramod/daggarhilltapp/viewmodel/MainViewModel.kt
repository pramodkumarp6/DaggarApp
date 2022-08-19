package com.pramod.daggarhilltapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pramod.daggarhilltapp.model.Product
import com.pramod.daggarhilltapp.repository.ProductRepository
import kotlinx.coroutines.launch
import javax.inject.Inject




class MainViewModel(private  val repository: ProductRepository): ViewModel() {
    val productLiveData : LiveData<List<Product>>

    get() = repository.products

    init {
        viewModelScope.launch{
            repository.getProducts()


        }
    }



}
