package com.pramod.daggarhilltapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.pramod.daggarhilltapp.repository.ProductRepository
import javax.inject.Inject




class   MainViewModelFactory@Inject  constructor(val repository: ProductRepository) :ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}


