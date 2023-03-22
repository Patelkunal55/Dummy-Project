package com.example.dummyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_my_shared_preferances.*
import kotlinx.android.synthetic.main.activity_my_spinner.*

class MySpinner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_spinner)

        //val customList = listOf<String>("First","Second","Third","Fourth")
        //val adapter = ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,customList)
        //sp_months.adapter = adapter

       sp_months.onItemSelectedListener = object : OnItemSelectedListener {


           override fun onItemSelected(adapter: AdapterView<*>?, view: View?, position: Int, p3: Long) {
               val pass = "You Selected ${adapter?.getItemAtPosition(position).toString()}"
               Toast.makeText(applicationContext,pass,Toast.LENGTH_SHORT).show()
               tv_text.text = pass
           }

           override fun onNothingSelected(p0: AdapterView<*>?) {
               TODO("Not yet implemented")
           }
       }


    }
}