package com.example.my_week4_task

import android.content.res.Resources
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter:  RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>(){

    private var  viewPagerList = arrayListOf<ViewPagerItemModel>()

    fun getViewPagerList(list : ArrayList<ViewPagerItemModel>){
        this.viewPagerList = list
    }

    inner class ViewPagerViewHolder(view: View): RecyclerView.ViewHolder(view){
        val name = view.findViewById<TextView>(R.id.viewpager_item_birthday_message_textView)
        val card = view.findViewById<ConstraintLayout>(R.id.viewpager_item_cardView_layout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.card_layout_item, parent, false )
        return ViewPagerViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        holder.name.text = "It's ${viewPagerList[position].name}'s birthday"
        holder.card.background = viewPagerList[position].backgroundImage
    }

    override fun getItemCount(): Int {
        return  viewPagerList.size
    }

}