package com.example.dagger2example.Model.Light

import android.util.Log
import dagger.assisted.AssistedInject
import javax.inject.Inject
import javax.inject.Named

class BlueLight : Light() {

    override fun getInfo() {
        Log.d("TAG", "getLightInfo BlueLight : brightLight " + brightLight)
    }

}