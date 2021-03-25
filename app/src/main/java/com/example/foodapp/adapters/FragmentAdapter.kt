package com.example.foodapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.foodapp.registration.LoginFragment
import com.example.foodapp.registration.RegisterFragment

class FragmentAdapter(fm:FragmentManager):FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {


    override fun getCount(): Int  = 2

    override fun getItem(position: Int): Fragment = when(position){
        0->{
            LoginFragment()
        }
        1 ->{
            RegisterFragment()
        }
        else->{
            LoginFragment()
        }
    }

    override fun getPageTitle(position: Int): String {
        return when(position){
            0 ->{"Login"}
            1 ->{"Sign-up"}
            else ->{"Login"}
        }
    }


}