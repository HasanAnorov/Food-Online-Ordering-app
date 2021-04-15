package com.example.foodapp.ui_drawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.databinding.ActivityOrdersBinding

class OrdersActivity : AppCompatActivity() {

    private lateinit var binding : ActivityOrdersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrdersBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        

    }
}