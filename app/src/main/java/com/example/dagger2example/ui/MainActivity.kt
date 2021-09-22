package com.example.dagger2example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dagger2example.Model.Car
import com.example.dagger2example.R
import com.example.dagger2example.application.CarApplication
import com.example.dagger2example.dagger.Component.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var car : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerCarComponent.builder()
            .brightLight(10)
            .horsePower(10)
            .appComponent((application as CarApplication).getAppComponent())
            .build()
            .inject(this)


        Log.d("TAG", "onCreate: " + car)
        Log.d("TAG", "onCreate: " + car.driver)


    }

}