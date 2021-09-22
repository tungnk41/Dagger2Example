package com.example.dagger2example.Model.Engine

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class HorseEngine @Inject constructor() : Engine {
    override fun getInfo() {
        Log.d("TAG", "HorseEngine: " + this)
    }
}