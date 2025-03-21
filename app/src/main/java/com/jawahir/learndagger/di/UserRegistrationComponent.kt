package com.jawahir.learndagger.di

import com.jawahir.learndagger.MainActivity
import com.jawahir.learndagger.di.module.NotificationServiceBindsModule
import com.jawahir.learndagger.di.module.NotificationServiceProvidesModule
import com.jawahir.learndagger.di.module.UserRegistrationModule
import com.jawahir.learndagger.di.scope.ActivityScope
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@ActivityScope
@Component(
    dependencies = [AppComponent::class],
    modules = [
        UserRegistrationModule::class,
        NotificationServiceProvidesModule::class,
        NotificationServiceBindsModule::class
    ]
)
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance @Named("retry") retry: Int, appComponent: AppComponent): UserRegistrationComponent
    }
}