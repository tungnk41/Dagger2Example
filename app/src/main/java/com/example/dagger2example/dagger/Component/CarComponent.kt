package com.example.dagger2example.dagger.Component

import com.example.dagger2example.dagger.Module.*
import com.example.dagger2example.ui.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.ActivityScope
import javax.inject.ApplicationScope
import javax.inject.Named

@ActivityScope
@Component(dependencies = [AppComponent::class],modules = [EngineModule::class, WheelModule::class, LightModule::class, CarModule::class])
interface CarComponent {


    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun brightLight(@Named("brightLight")brightLight : Int) : Builder

        @BindsInstance
        fun horsePower(@Named("horsePower")horsePower : Int) : Builder

        fun appComponent(component: AppComponent) : Builder

        fun build() : CarComponent
    }

}