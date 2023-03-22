package com.example.dummyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_my_recycler_view.*

class MyRecyclerView : AppCompatActivity(),ExampleAdapter.OnItemClickListener {

    val exampleList = ArrayList<ExampleItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_recycler_view)

        dataItem()

        recycler_view.adapter = ExampleAdapter(exampleList,this)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)

    }

    override fun onItemClick(position: Int) {
        Toast.makeText(this,"Clicked $position",Toast.LENGTH_SHORT).show()
    }

    fun dataItem(){

        exampleList.add(ExampleItem(R.drawable.home,"Home","This is a Home sweet home"))
        exampleList.add(ExampleItem(R.drawable.settings,"Setting","This is a Mind blowing setting"))
        exampleList.add(ExampleItem(R.drawable.favorite,"Favourite","This is my favourite"))
        exampleList.add(ExampleItem(R.drawable.rocket,"Rocket","This is my rocket factory"))
        exampleList.add(ExampleItem(R.drawable.home,"Home","This is a Home sweet home"))
        exampleList.add(ExampleItem(R.drawable.settings,"Setting","This is a Mind blowing setting"))
        exampleList.add(ExampleItem(R.drawable.favorite,"Favourite","This is my favourite"))
        exampleList.add(ExampleItem(R.drawable.rocket,"Rocket","This is my rocket factory"))
        exampleList.add(ExampleItem(R.drawable.home,"Home","This is a Home sweet home"))
        exampleList.add(ExampleItem(R.drawable.settings,"Setting","This is a Mind blowing setting"))
        exampleList.add(ExampleItem(R.drawable.favorite,"Favourite","This is my favourite"))
        exampleList.add(ExampleItem(R.drawable.rocket,"Rocket","This is my rocket factory"))


    }


}