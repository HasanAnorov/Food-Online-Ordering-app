package com.example.foodapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.databinding.RecyclerItemViewBinding
import com.example.foodapp.models.FoodModel
import com.squareup.picasso.Picasso

class FoodMenuRecyclerAdapter(val itemClick:(model:FoodModel) ->Unit):RecyclerView.Adapter<FoodMenuRecyclerAdapter.ViewHolderFoodMenu>() {

    private val itemCallback = object :DiffUtil.ItemCallback<FoodModel>(){

        override fun areItemsTheSame(oldItem: FoodModel, newItem: FoodModel): Boolean {
            return oldItem == newItem
        }
        override fun areContentsTheSame(oldItem: FoodModel, newItem: FoodModel): Boolean {
            return oldItem.foodName == newItem.foodName
        }

    }

    val differ = AsyncListDiffer(this,itemCallback)

    inner class ViewHolderFoodMenu(private  var binding:RecyclerItemViewBinding):RecyclerView.ViewHolder(binding.root){
        fun onBind(model:FoodModel){
            binding.foodName.text = model.foodName
            binding.foodPrice.text = model.foodPrice

            model.image?.let {
                Picasso.get().load(it)
                        .fit()
                        .centerCrop()
                        .into(binding.ivFoodPhoto)
            }
            binding.root.setOnClickListener {
                itemClick.invoke(model)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderFoodMenu {
        return  ViewHolderFoodMenu(
        RecyclerItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolderFoodMenu, position: Int) {
        holder.onBind(differ.currentList[position])
    }

    override fun getItemCount(): Int = differ.currentList.size

}