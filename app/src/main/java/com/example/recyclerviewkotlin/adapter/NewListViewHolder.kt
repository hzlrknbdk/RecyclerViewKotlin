package com.example.recyclerviewkotlin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewkotlin.R
import com.example.recyclerviewkotlin.dto.DataDto
import com.squareup.picasso.Picasso

class NewListViewHolder(viewGroup: ViewGroup) : RecyclerView.ViewHolder(LayoutInflater.from(viewGroup.context)
        .inflate(R.layout.item_list, viewGroup, false)) {
    private val txtCompany by lazy { itemView.findViewById<TextView>(R.id.txtCompany) }
    private val txtImage by lazy { itemView.findViewById<ImageView>(R.id.imgLogo) }
    private val txtFoundingYear by lazy { itemView.findViewById<TextView>(R.id.txtFoundingYear) }

    fun bindTo(dataDto: DataDto) {

        txtCompany.text = dataDto.company
        Picasso.get().load(dataDto.imageUrl).into(txtImage)
        txtFoundingYear.text = dataDto.foundingYear.toString()


    }


}