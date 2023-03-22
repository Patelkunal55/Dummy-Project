package com.example.dummyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.pick_image.*

class PickImage : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var imageView : ImageView

    val contract = registerForActivityResult(ActivityResultContracts.GetContent()){

    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pick_image)

        btn_pick_image.setOnClickListener {
            contract.launch("image/*")
        }



    }
}