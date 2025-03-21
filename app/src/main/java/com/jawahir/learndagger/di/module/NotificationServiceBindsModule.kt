package com.jawahir.learndagger.di.module

import com.jawahir.learndagger.di.qualifier.EmailNotificationsAnnotation
import com.jawahir.learndagger.service.EmailService
import com.jawahir.learndagger.service.NotificationService
import dagger.Binds
import dagger.Module

@Module
abstract class NotificationServiceBindsModule {
    @EmailNotificationsAnnotation
    @Binds
    abstract fun bindEmailService(emailService: EmailService): NotificationService
}