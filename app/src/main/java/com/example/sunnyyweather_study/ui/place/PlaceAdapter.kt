package com.example.sunnyyweather_study.ui.place

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.sunnyyweather_study.R
import com.example.sunnyyweather_study.logic.model.Place

class PlaceAdapter(private val fragment: Fragment,private val placeList: List<Place>):
    RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val placeName: TextView = view.findViewById(R.id.placeName)
            val placeAddress : TextView = view.findViewById(R.id.placeAddress)
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.place_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlaceAdapter.ViewHolder, position: Int) {
        val place = placeList[position]
        holder.placeName.text = place.name
        holder.placeAddress.text = place.address
    }

    override fun getItemCount(): Int {
        return placeList.size
    }
}