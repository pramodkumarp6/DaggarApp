package com.pramod.daggarhilltapp.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.pramod.daggarhilltapp.model.Product
import com.pramod.daggarhilltapp.network.FakerAPI
import javax.inject.Inject


class ProductRepository @Inject constructor(private val fakeApi: FakerAPI) {
    private val product = MutableLiveData<List<Product>>()

    val products: LiveData<List<Product>>
        get() = product


    suspend fun getProducts() {
        val result = fakeApi.getProducts()
        if (result.isSuccessful && result.body() != null) {
            product.postValue(result.body())

        }
    }
}




