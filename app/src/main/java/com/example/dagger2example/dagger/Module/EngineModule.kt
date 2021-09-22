package com.example.dagger2example.dagger.Module

import com.example.dagger2example.Model.Engine.ElectEngine
import com.example.dagger2example.Model.Engine.Engine
import com.example.dagger2example.Model.Engine.HorseEngine
import dagger.Binds

import dagger.Module;
import dagger.Provides;
import javax.inject.ActivityScope
import javax.inject.ApplicationScope
import javax.inject.Named

@Module
abstract class EngineModule {

    @Binds
    @Named("ElectEngine")
    @ActivityScope
    abstract fun provideElectEngine(electEngine: ElectEngine) : Engine


    @Binds
    @Named("HorseEngine")
    @ActivityScope
    abstract fun provideHorseEngine(horseEngine: HorseEngine) : Engine
}
