package com.example.sunnyyweather_study.logic.model

import android.location.Location
import com.google.gson.annotations.SerializedName

    data class PlaceResponse(val status: String, val places: List<Place>)

    data class Place(
     val name: String, val location: Locations,
     @SerializedName("formatted_address") val address: String
    )

    data class Locations(val lng: String, val lat: String)

