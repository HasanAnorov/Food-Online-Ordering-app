package com.example.foodapp.food_menu

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.foodapp.R
import com.example.foodapp.adapters.FoodMenuRecyclerAdapter
import com.example.foodapp.databinding.FragmentFoodsBinding
import com.example.foodapp.models.FoodModel
import com.example.foodapp.ui.ItemViewInfoActivity

class FoodsFragment : Fragment() {

    private lateinit var binding: FragmentFoodsBinding
    private lateinit var adapter : FoodMenuRecyclerAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentFoodsBinding.inflate(inflater,container,false)

        adapter = FoodMenuRecyclerAdapter(){foodModel ->
            val intent = Intent(requireContext(),ItemViewInfoActivity::class.java)
            startActivity(intent)

        }
        adapter.differ.submitList(mutableListOf(
                FoodModel(R.drawable.food,"Pizza plaza","P-52.000"),
                FoodModel(R.drawable.food,"Pizza plaza","P-52.000"),
                FoodModel(R.drawable.food,"Pizza plaza","P-52.000"),
                FoodModel(R.drawable.food,"Pizza plaza","P-52.000"),
                FoodModel(R.drawable.food,"Pizza plaza","P-52.000"),
                FoodModel(R.drawable.food,"Pizza plaza","P-52.000"),
                FoodModel(R.drawable.food,"Pizza plaza","P-52.000"),
                FoodModel(R.drawable.food,"Pizza plaza","P-52.000"),
                FoodModel(R.drawable.food,"Pizza plaza","P-52.000"),
                FoodModel(R.drawable.food,"Pizza plaza","P-52.000"),
                FoodModel(R.drawable.food,"Pizza plaza","P-52.000"),
                FoodModel(R.drawable.food,"Pizza plaza","P-52.000")

        ))
        binding.recyclerView.adapter = adapter


        return binding.root
    }


}