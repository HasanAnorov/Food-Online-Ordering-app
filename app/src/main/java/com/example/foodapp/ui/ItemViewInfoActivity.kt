package com.example.foodapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.MainActivity
import com.example.foodapp.R
import com.example.foodapp.adapters.FoodInfoPhotoAdapter
import com.example.foodapp.databinding.ActivityItemViewInfoBinding

class ItemViewInfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityItemViewInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemViewInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btnBack.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }

        val adapter = FoodInfoPhotoAdapter(listOf(
                R.drawable.food,
                R.drawable.food,
                R.drawable.food,
                R.drawable.food
        ))

        binding.foodInfoViewPager.adapter = adapter
        binding.indicator.setViewPager(binding.foodInfoViewPager)


    }
}