package com.example.dummyproject

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global.putString
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_my_shared_preferances.*
import kotlinx.android.synthetic.main.example_item.*

class MySharedPreferances : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_shared_preferances)

        loadData()

        bt_button.setOnClickListener {
            saveData()
        }
    }


    private fun saveData(){
        val insertText = et_text.text.toString()
        tv_text.text = insertText

        val sharedPreferances = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE)
        val editior = sharedPreferances.edit()

        editior.apply {
            putString("STRING_KEY",insertText)
            putBoolean("BOOLEAN_KEY",sw_switch.isChecked)
        }.apply()


    }

    private fun loadData(){
        val sharedPreferances = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE)

        val textData = sharedPreferances.getString("STRING_KEY",null)
        val booleanData = sharedPreferances.getBoolean("BOOLEAN_KEY",false)

        tv_text.text = textData
        sw_switch.isChecked = booleanData



    }






}