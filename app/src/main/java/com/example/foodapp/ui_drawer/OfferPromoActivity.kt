package com.example.foodapp.ui_drawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.databinding.ActivityOfferPromoBinding

class OfferPromoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOfferPromoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOfferPromoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        

    }
}