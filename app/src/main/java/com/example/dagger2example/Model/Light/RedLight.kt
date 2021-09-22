package com.example.dagger2example.Model.Light

import android.util.Log
import dagger.assisted.AssistedInject
import javax.inject.Inject
import javax.inject.Named

class RedLight : Light() {

    override fun getInfo() {
        Log.d("TAG", "getLightInfo RedLight: brightLight " + brightLight)
    }
}