package com.example.dummyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_my_dialog.*

class My_Dialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_dialog)

      btn_dialog.setOnClickListener {

          val builder = AlertDialog.Builder(this)


          builder.setTitle("Dialog Box")

          builder.setMessage("This is a Dialog Box and the description of the dialog box")

          builder.setIcon(R.drawable.ic_baseline_emoji_emotions_24)

          builder.setPositiveButton("Yes") {dialogInterface,which ->
              Toast.makeText(this,"Yes is Clicked",Toast.LENGTH_SHORT).show()
          }

          builder.setNegativeButton("No"){dialogInterface,which->
              Toast.makeText(this,"Yes is Clicked",Toast.LENGTH_SHORT).show()
          }

          builder.setNeutralButton("Cancel"){dialogInterface,which ->
              Toast.makeText(this,"Cancel is Clicked",Toast.LENGTH_SHORT).show()
          }

          val alertDialog:AlertDialog = builder.create()
          alertDialog.create()
          alertDialog.show()


      }
    }
}