package com.jawahir.learndagger.di

import com.jawahir.learndagger.service.EmailService
import com.jawahir.learndagger.service.NotificationService
import com.jawahir.learndagger.service.SmsService
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceProvidesModule() {
    @Named("sms")
    @Provides
    @Singleton
    fun provideSmsService(@Named("retry") retry:Int): NotificationService {
        return SmsService(retry)
    }
}

@Module
abstract class NotificationServiceBindsModule {
    @EmailNotificationsAnnotation
    @Binds
    abstract fun bindEmailService(emailService: EmailService): NotificationService
}