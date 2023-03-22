package com.example.dummyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_bottom_sheet.*

class My_Bottom_sheet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_bottom_sheet)

        val bottomSheetFragment = BottomSheetFragment()


        btn_bottom_sheet.setOnClickListener {

            bottomSheetFragment.show(supportFragmentManager,"BottomSheetDialog")
        }
    }
}