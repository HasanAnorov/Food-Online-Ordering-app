package com.example.foodapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(setOf(
                R.id.nav_profile, R.id.nav_orders, R.id.nav_offer_and_promo, R.id.nav_privacy, R.id.nav_security), drawerLayout)

        navView.setupWithNavController(navController)

        bottomNavigationView.itemRippleColor = null
        bottomNavigationView.setBackgroundResource(android.R.color.transparent)
        bottomNavigationView.setupWithNavController(navController)



       bottomNavigationView.setOnNavigationItemSelectedListener {

           when(it.itemId){
               R.id.menu_home -> {
                   if (!bottomNavigationView.menu.getItem(0).isChecked)
                   navController.navigate(R.id.homeBottomFragment)
               }
               R.id.menu_history -> {
                   navController.navigate(R.id.historyActivity)
               }
               R.id.menu_profile -> {
                   navController.navigate(R.id.profileBottomActivity)
               }
               R.id.menu_favorites -> {
                   Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
               }
               else ->{
                   navController.navigate(R.id.homeBottomFragment)
               }
           }

           true
       }


    }

    fun openDrawer(){
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
            drawerLayout.openDrawer(GravityCompat.START)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onBackPressed() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        }
        else {
            super.onBackPressed()
        }
    }


    override fun onResume() {
        super.onResume()
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.menu.getItem(0).isChecked = true
    }

}