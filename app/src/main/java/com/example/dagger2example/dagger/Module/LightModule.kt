package com.example.dagger2example.dagger.Module

import com.example.dagger2example.Model.Light.BlueLight
import com.example.dagger2example.Model.Light.Light
import com.example.dagger2example.Model.Light.RedLight
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.ActivityScope
import javax.inject.ApplicationScope
import javax.inject.Named

@Module
class LightModule {

    @Provides
    @Named("RedLight")
    @ActivityScope
    fun provideRedLight(@Named("brightLight") brightLight : Int) : Light {
        return RedLight(brightLight)
    }

    @Provides
    @Named("BlueLight")
    @ActivityScope
    fun provideBlueLight(@Named("brightLight") brightLight : Int) : Light {
        return BlueLight(brightLight)
    }
}