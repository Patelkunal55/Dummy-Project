package com.example.dummyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_my_recycler_view.*
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory


class MyRecyclerView : AppCompatActivity(),ExampleAdapter.OnItemClickListener {

    val exampleList = ArrayList<News>()

    lateinit var myAdapter:ExampleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_recycler_view)



        //recycler_view.adapter = ExampleAdapter(this,exampleList)




        getNews()



    }

    private fun getNews() {
        val news = NewsService.newsInstance.getHeadlines("in",1)
        news.enqueue(object : Callback<News?> {
            override fun onResponse(call: Call<News?>, response: Response<News?>) {
                val news = response.body()
                if (news != null) {
                    myAdapter = ExampleAdapter(this@MyRecyclerView,news.articles)
                    recycler_view.adapter = myAdapter
                    recycler_view.layoutManager = LinearLayoutManager(this@MyRecyclerView)
                    recycler_view.setHasFixedSize(true)


                }

            }

            override fun onFailure(call: Call<News?>, t: Throwable) {


            }
        })
    }

    override fun onItemClick(position: Int) {
        Toast.makeText(this,"Clicked $position",Toast.LENGTH_SHORT).show()
    }






}