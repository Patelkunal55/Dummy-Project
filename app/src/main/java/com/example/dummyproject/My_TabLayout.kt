package com.example.dummyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.dummyproject.fragments.FavouriteFragment
import com.example.dummyproject.fragments.HomeFragment
import com.example.dummyproject.fragments.SettingFragment
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_my_tab_layout.*

class My_TabLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_tab_layout)


        setUpTab()
    }



    private fun setUpTab(){

       val adapter = ViewPagerAdapter(this)
        adapter.addFragment(HomeFragment(),"Home")
        adapter.addFragment(FavouriteFragment(),"Favourite")
        adapter.addFragment(SettingFragment(),"Setting")

        viewPager.adapter = adapter

        TabLayoutMediator(tab_layout,viewPager){tabs ,position ->
            tabs.text = adapter.getTitle(position)
        }.attach()
    }



}