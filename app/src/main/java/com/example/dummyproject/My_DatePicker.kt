package com.example.dummyproject

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_date_picker.*
import kotlinx.android.synthetic.main.activity_my_popup_menu.*
import java.time.Year
import java.util.Calendar

class My_DatePicker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_date_picker)



        pickDateBtn.setOnClickListener {

            val cal = Calendar.getInstance()

            val mYear = cal.get(Calendar.YEAR)
            val mMonth = cal.get(Calendar.MONTH)
            val mDay = cal.get(Calendar.DAY_OF_MONTH)

            val pickDateDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, month, day ->

                //date_tv.setText(" "+mDay+"/"+" "+mMonth+"/"+" "+year)
                date_tv.text = " "+day + "/" + " "+month+ "/"+" "+ year

            },mYear,mMonth,mDay)
            pickDateDialog.show()
        }

    }
}