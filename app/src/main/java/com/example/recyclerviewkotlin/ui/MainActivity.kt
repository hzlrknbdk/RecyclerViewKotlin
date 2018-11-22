package com.example.recyclerviewkotlin.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewkotlin.R
import com.example.recyclerviewkotlin.adapter.NewListAdapter
import com.example.recyclerviewkotlin.dto.DataDto
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newList = ArrayList<DataDto>()

        newList.add(DataDto("https://www.geartechnology.com/blog/wp-content/uploads/2016/02/google_logo_2015_by_eduard2009-d9809xo-800x500_c.png", "Google", 1998))
        newList.add(DataDto("https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/YouTube_Logo.svg/2000px-YouTube_Logo.svg.png", "Youtube", 2005))
        newList.add(DataDto("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Apple_logo_black.svg/2000px-Apple_logo_black.svg.png", "Apple", 1976))
        newList.add(DataDto("https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/IBM_logo.svg/1280px-IBM_logo.svg.png", "IBM", 1911))
        newList.add(DataDto("https://upload.wikimedia.org/wikipedia/tr/thumb/f/f2/Twitter-bird-light-bgs.png/220px-Twitter-bird-light-bgs.png", "Twıtter", 2006))
        newList.add(DataDto("https://upload.wikimedia.org/wikipedia/tr/f/fa/Medium_logo.png", "Medıum", 2012))
        newList.add(DataDto("http://pngimg.com/uploads/facebook_logos/facebook_logos_PNG19756.png", "Facebook", 2006))
        newList.add(DataDto("http://static.squarespace.com/static/531f2c4ee4b002f5b011bf00/t/536bdcefe4b03580f8f6bb16/1399577848961/hbosiliconvalleypiedpiperoldlogo", "Pıed Pıper", 2015))
        newList.add(DataDto("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Wikipedia_Logo_1.0.png/220px-Wikipedia_Logo_1.0.png", "Wıkıpedıa", 2001))


        recyclerView.apply {
            this.layoutManager = LinearLayoutManager(this@MainActivity)
            this.adapter = NewListAdapter(newList)
        }
    }
}
