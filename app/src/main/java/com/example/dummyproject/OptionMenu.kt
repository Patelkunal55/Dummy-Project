package com.example.dummyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import java.util.zip.Inflater

class OptionMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_menu,menu)

        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id. home-> Toast.makeText(this,"Home is Selected",Toast.LENGTH_SHORT).show()
            R.id.favourite -> Toast.makeText(this,"Favourite is Selected",Toast.LENGTH_SHORT).show()
            R.id.setting -> Toast.makeText(this, "Setting is Selected",Toast.LENGTH_SHORT).show()
        }

        return super.onOptionsItemSelected(item)
    }








}