package com.example.foodapp.bottom_navigation_view

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.foodapp.R
import com.example.foodapp.adapters.HomeFoodMenuAdapter
import com.example.foodapp.databinding.FragmentHomeBottomBinding
import com.yarolegovich.slidingrootnav.SlidingRootNav
import com.yarolegovich.slidingrootnav.SlidingRootNavBuilder


class HomeBottomFragment : Fragment() {

    private lateinit var binding :FragmentHomeBottomBinding
    private var slidingRootNav: SlidingRootNav? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBottomBinding.inflate(inflater, container, false)

//        binding.drawIcon.setOnClickListener {
//            (activity as MainActivity).openDrawer()
//        }
        activity?.getWindow()?.statusBarColor   = getActivity()?.getColor(R.color.white) ?:R.color.white



        slidingRootNav = SlidingRootNavBuilder(requireActivity())
                .withToolbarMenuToggle(binding.toolbar)
                .withMenuOpened(false)

                //.withContentClickableWhenMenuOpened(false)
                .withSavedState(savedInstanceState)
                .withMenuLayout(R.layout.slide_nav_rawer)
                .inject();



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