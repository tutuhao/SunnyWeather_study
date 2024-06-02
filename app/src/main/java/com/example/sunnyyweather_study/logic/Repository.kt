package com.example.sunnyyweather_study.logic

import androidx.lifecycle.liveData
import com.example.sunnyyweather_study.logic.model.Place
import com.example.sunnyyweather_study.logic.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import java.lang.RuntimeException

object Repository {

    fun searchPlaces (query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val place = placeResponse.places
                Result.success(place)
            } else {
               Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }

        } catch (e: Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}