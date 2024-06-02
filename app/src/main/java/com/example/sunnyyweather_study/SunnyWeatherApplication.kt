package com.example.sunnyyweather_study

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication: Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
         lateinit var context:  Context
         const val TOKEN = "s2A4J1HLALFF0IgW"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}