package com.example.dagger2example.dagger.Module


import com.example.dagger2example.Model.Wheel.Wheel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
class WheelModule {

    @Provides
    @ActivityScoped
    fun provideWheel() = Wheel()
}