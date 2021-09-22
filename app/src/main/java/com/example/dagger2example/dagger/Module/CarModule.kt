package com.example.dagger2example.dagger.Module

import com.example.dagger2example.Model.Car
import com.example.dagger2example.Model.Driver.Driver
import com.example.dagger2example.Model.Engine.Engine
import com.example.dagger2example.Model.Light.Light
import com.example.dagger2example.Model.Wheel.Wheel

import dagger.Module
import dagger.Provides
import javax.inject.ActivityScope
import javax.inject.ApplicationScope
import javax.inject.Named

@Module
class CarModule {

    @Provides
    @ActivityScope
    fun provideCar(@Named("ElectEngine") engine : Engine, wheel : Wheel, driver : Driver, @Named("BlueLight")light : Light) : Car {
        return Car (engine,wheel,driver,light)
    }
}