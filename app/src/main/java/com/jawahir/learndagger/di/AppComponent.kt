package com.jawahir.learndagger.di

import com.jawahir.learndagger.analytics.AnalyticsService
import com.jawahir.learndagger.di.module.AnalyticsServiceModule
import com.jawahir.learndagger.di.scope.ApplicationScope
import dagger.Component

@ApplicationScope
@Component(modules = [AnalyticsServiceModule::class])
interface AppComponent {
    fun getAnalyticsService():AnalyticsService
}