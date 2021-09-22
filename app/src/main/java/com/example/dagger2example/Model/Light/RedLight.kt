package com.example.dagger2example.Model.Light

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class RedLight : Light {
    private var brightLight : Int = 0

    constructor( brightLight : Int){
        this.brightLight = brightLight
    }
    override fun getInfo() {
        Log.d("TAG", "getLightInfo RedLight: brightLight " + brightLight)
    }
}