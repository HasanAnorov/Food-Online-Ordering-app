package com.example.foodapp.bottom_navigation_view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.foodapp.MainActivity
import com.example.foodapp.adapters.HomeFoodMenuAdapter
import com.example.foodapp.databinding.FragmentHomeBottomBinding

class HomeBottomFragment : Fragment() {

    private lateinit var binding :FragmentHomeBottomBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBottomBinding.inflate(inflater,container,false)

        binding.drawIcon.setOnClickListener {
            (activity as MainActivity).openDrawer()
        }

        binding.etSearch.setOnClickListener {
            Toast.makeText(requireContext(), "Clicked", Toast.LENGTH_LONG).show()
            binding.etSearch.isFocusableInTouchMode = true
        }

        val adapter = HomeFoodMenuAdapter(parentFragmentManager)
        binding.viewPager.adapter = adapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)

        return binding.root
    }

//    private fun showBottomSheetDialog() {
//        val dialog = BottomSheetDialog(requireContext())
//        val dialogView = layoutInflater.inflate(R.layout.dialog_view,null,false)
//        dialog.setContentView(dialogView)
//        dialogView.tv_title.text = "This is bottom sheet dialog. Woow !"
//        dialogView.btn_dismiss.setOnClickListener {
//            dialog.dismiss()
//        }
//        dialog.show()
//
//    }

}