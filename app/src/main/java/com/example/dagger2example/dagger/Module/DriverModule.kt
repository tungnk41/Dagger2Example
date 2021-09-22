package com.example.dagger2example.dagger.Module

import com.example.dagger2example.Model.Driver.Driver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DriverModule {

    @Provides
    @Singleton
    fun provideDriver() : Driver {
        return Driver()
    }
}