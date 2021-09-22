package com.example.dagger2example.dagger.Module

import com.example.dagger2example.Model.Engine.ElectEngine
import com.example.dagger2example.Model.Engine.Engine
import com.example.dagger2example.Model.Engine.HorseEngine
import dagger.Binds

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
abstract class EngineModule {

    @Binds
    @Named("ElectEngine")
    @ActivityScoped
    abstract fun provideElectEngine(electEngine: ElectEngine) : Engine


    @Binds
    @Named("HorseEngine")
    @ActivityScoped
    abstract fun provideHorseEngine(horseEngine: HorseEngine) : Engine
}
