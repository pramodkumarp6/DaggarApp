package com.pramod.daggarhilltapp

import android.app.Application
import com.pramod.daggarhilltapp.di.ApplicationComponent
import com.pramod.daggarhilltapp.di.DaggerApplicationComponent

class FakerApplication: Application() {
            lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        applicationComponent =  DaggerApplicationComponent.builder().build()

    }
}