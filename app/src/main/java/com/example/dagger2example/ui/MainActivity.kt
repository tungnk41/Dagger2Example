package com.example.dagger2example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dagger2example.Model.Car
import com.example.dagger2example.Model.Driver.Driver
import com.example.dagger2example.Model.Wheel.Wheel
import com.example.dagger2example.R
import dagger.hilt.android.AndroidEntryPoint

import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject lateinit var car : Car
    @Inject lateinit var driver : Driver
    @Inject lateinit var wheel : Wheel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("TAG", "onCreate: " + car)
        Log.d("TAG", "onCreate: " + wheel)    //Same car.wheel object because both in ActivityScope
        Log.d("TAG", "onCreate: " + car.wheel)//Same wheel object because both in  ActivityScope
        Log.d("TAG", "onCreate: " + car.driver)// car.driver and driver is 1 instance of Driver, it's in ApplicationScope
        Log.d("TAG", "onCreate: " + driver)

    }

}