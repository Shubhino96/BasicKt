package com.example.shubhangi.basickt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.rvmain)
        recycler.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        var locationList = ArrayList<Location>()
        locationList.add(Location("http://travelwithaccess.com/site-backup/blog/wp-content/uploads/2015/09/nyvahn.jpg", "Nyvhan", "Copenhagen,Denmark"))
        locationList.add(Location("https://maristmessenger.co.nz/wp-content/uploads/2012/03/wellington-beehive.jpg", "Beehive", "Wellington,New Zealand"))
        locationList.add(Location("https://media.izi.travel/7d81b331-79d7-4127-9bb7-bdf5ed7c9496/e082d591-ab68-47dc-9c23-e33d4f06676b_800x600.jpg", "Paranoá Lake", "Brasilia,Brazil"))

        val adapter = LocationAdapter(locationList)
        recycler.adapter = adapter
    }

}
