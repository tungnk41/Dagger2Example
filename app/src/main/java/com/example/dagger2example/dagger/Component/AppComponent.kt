package com.example.dagger2example.dagger.Component

import com.example.dagger2example.Model.Driver.Driver
import com.example.dagger2example.application.CarApplication
import com.example.dagger2example.dagger.Module.*
import dagger.BindsInstance
import dagger.Component
import javax.inject.ApplicationScope
import javax.inject.Named


@ApplicationScope
@Component(modules = [AppModule::class,DriverModule::class])
interface AppComponent {
    fun inject(carApplication : CarApplication)
    fun getCarComponentBuilder() : CarComponent.Builder
}