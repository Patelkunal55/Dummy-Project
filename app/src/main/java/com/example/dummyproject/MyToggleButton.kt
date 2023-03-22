package com.example.dummyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_my_toggle_button.*

class MyToggleButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_toggle_button)

        text_on_off.text = "Button is Off"

        btn_toggle.setOnCheckedChangeListener { compoundButton, b ->

            if (btn_toggle.isChecked){
                text_on_off.text = "Button is On"
                Toast.makeText(this,"Button is On",Toast.LENGTH_SHORT).show()
            }else{
                text_on_off.text = "Button is Off"
                Toast.makeText(this,"Button is Off",Toast.LENGTH_SHORT).show()
            }

        }
    }
}