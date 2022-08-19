package com.pramod.daggarhilltapp.network

import com.pramod.daggarhilltapp.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {
    @GET("products")
    suspend fun getProducts(): Response<List<Product>>

}