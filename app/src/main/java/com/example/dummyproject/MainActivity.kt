package com.example.dummyproject

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialog_button.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            builder.setTitle("Dialog Message!")

            builder.setMessage(R.string.dialog)

            builder.setIcon(R.drawable.ic_baseline_emoji_emotions_24)

            builder.setPositiveButton("Yes") { dialogInterface, which ->
                Toast.makeText(this, "Yes is pressed", Toast.LENGTH_SHORT).show()
            }

            builder.setNegativeButton("No") { dialogInterface, which ->
                Toast.makeText(this, "No is pressed", Toast.LENGTH_SHORT).show()
            }

            builder.setNeutralButton("Cancel") { dialogInterface, which ->
                Toast.makeText(this, "Cancel is pressed", Toast.LENGTH_SHORT).show()
            }

            val alertDialog: AlertDialog = builder.create()

            alertDialog.create()
            alertDialog.show()


        }

    }


}