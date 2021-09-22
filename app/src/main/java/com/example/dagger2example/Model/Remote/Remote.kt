package com.example.dagger2example.Model.Remote

import android.util.Log
import com.example.dagger2example.Model.Car
import javax.inject.Inject

class Remote @Inject constructor() {
    fun setListener(car : Car){
        Log.d("TAG", "setListener: ")
    }

}