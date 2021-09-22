package com.example.dagger2example.dagger.Module

import com.example.dagger2example.Model.Car
import com.example.dagger2example.Model.Driver.Driver
import com.example.dagger2example.Model.Engine.Engine
import com.example.dagger2example.Model.Light.Light
import com.example.dagger2example.Model.Wheel.Wheel

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
class CarModule {

    @Provides
    @ActivityScoped
    fun provideCar(@Named("ElectEngine") engine : Engine, wheel : Wheel, driver : Driver, @Named("BlueLight")light : Light) : Car {
        return Car (engine,wheel,driver,light)
    }
}