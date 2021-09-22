package com.example.dagger2example.Model

import android.util.Log
import com.example.dagger2example.Model.Driver.Driver
import com.example.dagger2example.Model.Engine.Engine
import com.example.dagger2example.Model.Light.Light
import com.example.dagger2example.Model.Remote.Remote
import com.example.dagger2example.Model.Wheel.Wheel
import javax.inject.Inject
import javax.inject.Named

class Car (var engine: Engine,
           var wheel: Wheel,
           var driver : Driver,
           var light : Light
){
    fun getInfo(){
        engine.getInfo()
        wheel.getInfo()
        light.getInfo()
        driver.getInfo()
        Log.d("TAG", "Car: " + this)
    }

    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
        Log.d("TAG", "enableRemote: ")
    }
}