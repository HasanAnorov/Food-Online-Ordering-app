package com.example.foodapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.R
import kotlinx.android.synthetic.main.view_pager_item_view.view.*

class FoodInfoPhotoAdapter(val list:List<Int>):RecyclerView.Adapter<FoodInfoPhotoAdapter.ViewHolderInfo>() {



    inner  class ViewHolderInfo(itemView: View):RecyclerView.ViewHolder(itemView){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderInfo {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_pager_item_view,parent,false)
        return ViewHolderInfo(view)
    }

    override fun onBindViewHolder(holder: ViewHolderInfo, position: Int) {
        val curImage = list[position]
        holder.itemView.food_info_photo.setImageResource(curImage)
    }

    override fun getItemCount(): Int = list.size


}