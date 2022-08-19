package com.pramod.daggarhilltapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.pramod.daggarhilltapp.viewmodel.MainViewModel
import com.pramod.daggarhilltapp.viewmodel.MainViewModelFactory

import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel
    @Inject
     lateinit var mainViewModelFactory: MainViewModelFactory
    private val product: TextView
    get() = findViewById(R.id.products)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        (application as FakerApplication).applicationComponent.inject(this)

        mainViewModel = ViewModelProvider(this,mainViewModelFactory).get(MainViewModel::class.java)

      /*  mainViewModel.productLiveData.observe(this,{
          it.joinToString {x->title }
        })
*/

        mainViewModel.productLiveData.observe(this, Observer {
            product.text =  it.joinToString { x -> x.title + "\n\n" }
        })

    }
}