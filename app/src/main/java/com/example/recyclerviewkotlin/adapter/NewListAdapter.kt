package com.example.recyclerviewkotlin.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewkotlin.dto.DataDto

class NewListAdapter(private val newsList: List<DataDto>) : RecyclerView.Adapter<NewListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewListViewHolder {
        return NewListViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: NewListViewHolder, position: Int) {
        holder.bindTo(newsList[position])
    }

}