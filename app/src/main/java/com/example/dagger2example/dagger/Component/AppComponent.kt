package com.example.dagger2example.dagger.Component

import com.example.dagger2example.Model.Driver.Driver
import com.example.dagger2example.application.CarApplication
import com.example.dagger2example.dagger.Module.DriverModule
import dagger.Component
import javax.inject.ApplicationScope


@ApplicationScope
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun inject(carApplication : CarApplication)

    fun getDriver() : Driver
}