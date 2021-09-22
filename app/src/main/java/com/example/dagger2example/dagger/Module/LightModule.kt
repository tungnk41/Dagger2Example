package com.example.dagger2example.dagger.Module

import com.example.dagger2example.Model.Light.BlueLight
import com.example.dagger2example.Model.Light.Light
import com.example.dagger2example.Model.Light.RedLight
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
class LightModule {

    @Provides
    @Named("RedLight")
    @ActivityScoped
    fun provideRedLight() : Light {
        return RedLight()
    }

    @Provides
    @Named("BlueLight")
    @ActivityScoped
    fun provideBlueLight() : Light {
        return BlueLight()
    }
}