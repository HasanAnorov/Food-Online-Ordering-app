package com.example.foodapp.bottom_navigation_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.databinding.ActivityProfileBottomBinding

class ProfileBottomActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBottomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBottomBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()



    }
}