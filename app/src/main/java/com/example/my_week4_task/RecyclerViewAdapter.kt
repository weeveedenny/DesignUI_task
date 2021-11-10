package com.example.my_week4_task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder>() {

    //create a recycler view list
var recyclerViewList = arrayListOf<RecyclerViewModel>()


    //my class to hold recycler view layout item views
     inner class RecyclerViewViewHolder(val view: View): RecyclerView.ViewHolder(view){
        val avatarImageView = view.findViewById<ImageView>(R.id.recycler_image_view)
        val nameTextView = view.findViewById<TextView>(R.id.recycle_cardview_firstname)
        val birthdayDate = view.findViewById<TextView>(R.id.date)
        val daysToBirthday = view.findViewById<TextView>(R.id.recyclerView_days_to_birthday)
        val rightBar = view.findViewById<ConstraintLayout>(R.id.constraintLayout)
    }

    //this determines the layout to inflate into the recycler view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_layout_item, null, false)
        return RecyclerViewViewHolder(inflater)
    }


    //this binds the view in the view holder to the recycler view list
    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
        holder.avatarImageView.setImageResource(recyclerViewList[position].avatar)
        holder.nameTextView.text = recyclerViewList[position].name
        holder.birthdayDate.text = recyclerViewList[position].date
        holder.daysToBirthday.text = recyclerViewList[position].daysLeft
        holder.rightBar.setBackgroundColor(recyclerViewList[position].rightBarColor)
    }


    //ths returns the size of the list so the recycler view knows how many iterations to make
    override fun getItemCount(): Int {
        return recyclerViewList.size
    }


    //this aids in setting the recycler view list from the fragment
    fun SetTheRecyclerViewList(list: ArrayList<RecyclerViewModel>){
        this.recyclerViewList = list
    }

}