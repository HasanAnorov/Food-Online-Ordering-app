package com.example.foodapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.foodapp.food_menu.*

class HomeFoodMenuAdapter(fm:FragmentManager):FragmentStatePagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getCount(): Int = 7

    override fun getPageTitle(position: Int): String {
        return when(position){
            0 ->{
                "Foods"
            }
            1 ->{
               "Drinks"
            }
            2 ->{
                "Snacks"
            }
            3 ->{
                "Fast-foods"
            }
            4 ->{
                "Pizzas"
            }
            5 ->{
                "Bakery"
            }
            6 ->{
                "Ice-creams"
            }
            else ->{
                "Foods"
            }

        }
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 ->{
                FoodsFragment()
            }
            1 ->{
                DrinksFragment()
            }
            2 ->{
                SnacksFragment()
            }
            3 ->{
                FastFoodFragment()
            }
            4 ->{
                PizzaFragment()
            }
            5 ->{
                BakeryFragment()
            }
            6 ->{
                IcecreamsFragment()
            }
            else ->{
                FoodsFragment()
            }

        }
    }
}