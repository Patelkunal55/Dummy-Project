package com.example.dummyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_my_switch_button.*

class MySwitch_Button : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_switch_button)

        tv_on_off.text = " "
        
        
        
        switch_on_off.setOnCheckedChangeListener { compoundButton, b ->

            if(switch_on_off.isChecked){
                tv_on_off.text = "Switch is On"
                Toast.makeText(this,"Switch is On",Toast.LENGTH_SHORT).show()
            }else {
                tv_on_off.text = "Switch is Off"
                Toast.makeText(this,"Switch is On",Toast.LENGTH_SHORT).show()
            }


        }
    }
}