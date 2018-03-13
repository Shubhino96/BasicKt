package com.example.shubhangi.basickt

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

/**
 * Created by shubhangi on 11-03-2018.
 */
class LocationAdapter(val locList:ArrayList<Location>) : RecyclerView.Adapter<LocationAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bindItems(locList[position])

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(parent?.context).inflate(R.layout.item,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return locList.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        fun bindItems(location: Location){

            val locname=itemView.findViewById<TextView>(R.id.tv1)
            val placen=itemView.findViewById<TextView>(R.id.tv2)
            val image=itemView.findViewById<ImageView>(R.id.img)
            locname.text=location.Name
            placen.text=location.Place

            Glide.with(itemView.context).load(location.Imageurl).into(image)
        }
    }
}