package com.pramod.daggarhilltapp.di

import com.pramod.daggarhilltapp.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {


    fun inject(mainActivity: MainActivity)
}