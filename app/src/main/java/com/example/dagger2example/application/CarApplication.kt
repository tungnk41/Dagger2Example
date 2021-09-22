package com.example.dagger2example.application

import android.app.Application
import com.example.dagger2example.dagger.Component.AppComponent
import com.example.dagger2example.dagger.Component.DaggerAppComponent

class CarApplication : Application() {
    private lateinit var component : AppComponent

    companion object{
        lateinit var INSTANCE : CarApplication
    }

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
        component.inject(this)
        INSTANCE = this
    }

    fun getAppComponent() : AppComponent{
        return component
    }
}