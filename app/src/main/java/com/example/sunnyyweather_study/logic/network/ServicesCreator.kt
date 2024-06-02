package com.example.sunnyyweather_study.logic.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServicesCreator {
    private const val BASE_URl = "https://api.caiyunapp.com/"


    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> create(servicesClass: Class<T>): T = retrofit.create(servicesClass)

    inline fun <reified T> create() : T = create(T::class.java)



}