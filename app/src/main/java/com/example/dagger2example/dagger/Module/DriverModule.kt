package com.example.dagger2example.dagger.Module

import com.example.dagger2example.Model.Driver.Driver
import dagger.Module
import dagger.Provides
import javax.inject.ApplicationScope
import javax.inject.Singleton

@Module
class DriverModule {

    @Provides
    @ApplicationScope
    fun provideDriver() : Driver {
        return Driver()
    }
}