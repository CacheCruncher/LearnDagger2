package com.jawahir.learndagger.di

import com.jawahir.learndagger.MainActivity
import com.jawahir.learndagger.di.module.NotificationServiceBindsModule
import com.jawahir.learndagger.di.module.NotificationServiceProvidesModule
import com.jawahir.learndagger.di.module.UserRegistrationModule
import com.jawahir.learndagger.di.scope.ActivityScope
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@ActivityScope
@Subcomponent(
    modules = [
        UserRegistrationModule::class,
        NotificationServiceProvidesModule::class,
        NotificationServiceBindsModule::class
    ]
)
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): UserRegistrationComponent
        fun retryCount(@BindsInstance @Named("retry") retry: Int): Builder
    }
}