package com.example.dummyproject

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_my_popup_menu.*

class My_Popup_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_popup_menu)

        show_dialog.setOnClickListener {
            showPopupMenu(it)
        }
    }


    private fun showPopupMenu(view:View){
        PopupMenu(this,view).apply {
            inflate(R.menu.nav_menu)
            setOnMenuItemClickListener { item ->
                when(item.itemId){
                    R.id.home -> {
                        Toast.makeText(applicationContext,"Home is Clicked",Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.favourite -> {
                        Toast.makeText(applicationContext,"Favourite is Clicked",Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.setting -> {
                        Toast.makeText(applicationContext,"Setting is Clicked",Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> true
                }
            }

            show()
        }
    }










}