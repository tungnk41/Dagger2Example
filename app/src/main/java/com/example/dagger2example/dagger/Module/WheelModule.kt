package com.example.dagger2example.dagger.Module


import com.example.dagger2example.Model.Wheel.Wheel
import dagger.Module
import dagger.Provides
import javax.inject.ActivityScope
import javax.inject.ApplicationScope

@Module
class WheelModule {

    @Provides
    fun provideWheel() = Wheel()
}