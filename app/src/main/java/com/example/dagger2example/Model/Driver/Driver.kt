package com.example.dagger2example.Model.Driver

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

class Driver {

    fun getInfo(){
        Log.d("TAG", " Driver : " + this)
    }
}