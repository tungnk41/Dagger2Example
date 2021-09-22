package com.example.dagger2example.dagger.Module

import com.example.dagger2example.dagger.Component.CarComponent
import dagger.Module

@Module(subcomponents = [CarComponent::class])
class AppModule {

}