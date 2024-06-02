package com.example.sunnyyweather_study.ui.place

import androidx.lifecycle.*
import com.example.sunnyyweather_study.logic.Repository
import com.example.sunnyyweather_study.logic.model.Place


class PlaceViewModel : ViewModel() {

    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData = searchLiveData.switchMap { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }

}