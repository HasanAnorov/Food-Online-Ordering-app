package com.example.foodapp.ui_drawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.databinding.ActivityProfileDrawerBinding

class ProfileDrawerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileDrawerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileDrawerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()



    }
}