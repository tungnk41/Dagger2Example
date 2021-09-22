package com.example.dagger2example.Model.Wheel

import android.util.Log
import javax.inject.Inject

class Wheel @Inject constructor() {
    fun getInfo(){
        Log.d("TAG", "Wheel: ")
    }
}