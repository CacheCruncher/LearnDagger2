package com.jawahir.learndagger.di.module

import com.jawahir.learndagger.di.scope.ActivityScope
import com.jawahir.learndagger.di.scope.ApplicationScope
import com.jawahir.learndagger.service.NotificationService
import com.jawahir.learndagger.service.SmsService
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceProvidesModule() {
    @Named("sms")
    @Provides
    @ActivityScope
    fun provideSmsService(@Named("retry") retry:Int): NotificationService {
        return SmsService(retry)
    }
}

