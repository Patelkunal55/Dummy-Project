package com.example.dummyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.dummyproject.fragments.FavouriteFragment
import com.example.dummyproject.fragments.HomeFragment
import com.example.dummyproject.fragments.SettingFragment
import kotlinx.android.synthetic.main.activity_my_bottom_navigation.*
import kotlinx.android.synthetic.main.activity_my_shared_preferances.*
import kotlinx.android.synthetic.main.fragment_favourite.*

class MyBottomNavigation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_bottom_navigation)


        val homeFragment = HomeFragment()
        val favouriteFragment = FavouriteFragment()
        val settingFragment = SettingFragment()

        makeCurrentFragment(homeFragment)


        bottom_navigate.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> makeCurrentFragment(homeFragment)
                R.id.favourite -> makeCurrentFragment(favouriteFragment)
                R.id.setting -> makeCurrentFragment(settingFragment)
            }
            true
        }




    }


    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper,fragment)
            commit()

        }








}