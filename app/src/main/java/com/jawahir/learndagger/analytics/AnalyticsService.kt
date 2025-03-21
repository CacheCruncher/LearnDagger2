package com.jawahir.learndagger.analytics

import android.util.Log
import com.jawahir.learndagger.di.scope.ApplicationScope
import javax.inject.Inject

interface AnalyticsService {
    fun track(event: String, eventType: String)
}

@ApplicationScope
class FirebaseAnalyticsService @Inject constructor(): AnalyticsService {
    override fun track(event: String, eventType: String) {
        Log.d("FirebaseAnalyticsService", "track: $event, $eventType")
    }

}

@ApplicationScope
class MixPanelAnalyticsService @Inject constructor(): AnalyticsService {
    override fun track(event: String, eventType: String) {
        Log.d("MixPanelAnalyticsService", "track: $event, $eventType")
    }
}