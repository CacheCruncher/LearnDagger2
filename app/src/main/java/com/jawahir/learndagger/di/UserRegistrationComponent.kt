package com.jawahir.learndagger.di

import com.jawahir.learndagger.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [UserRegistrationModule::class, NotificationServiceProvidesModule::class, NotificationServiceBindsModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance @Named("retry") retry:Int):UserRegistrationComponent
    }
}