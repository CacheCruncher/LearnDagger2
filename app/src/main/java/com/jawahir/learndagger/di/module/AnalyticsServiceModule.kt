package com.jawahir.learndagger.di.module

import com.jawahir.learndagger.analytics.AnalyticsService
import com.jawahir.learndagger.analytics.MixPanelAnalyticsService
import com.jawahir.learndagger.di.scope.ApplicationScope
import dagger.Binds
import dagger.Module

@Module
abstract class AnalyticsServiceModule {

    @ApplicationScope
    @Binds
    abstract fun bindsMixPanelAnalyticsService(mixPanelAnalyticsService: MixPanelAnalyticsService): AnalyticsService
}