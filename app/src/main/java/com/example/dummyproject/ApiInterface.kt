package com.example.dummyproject

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

//https://newsapi.org/v2/top-headlines?country=in&apiKey=API_KEYS


const val BASE_URLS = "https://newsapi.org/"
const val API_KEY = "cfd8b185db8e4737907ee7dcd7923ad9"

interface NewsInterface {

    @GET("v2/top-headlines?apiKey=$API_KEY")
    fun getHeadlines(@Query("country")country:String, @Query("page")page:Int) : Call<News>

    //https://newsapi.org/v2/top-headlines?apiKey=$API_KEY&country=in&page=1

}

object NewsService {
    val newsInstance : NewsInterface
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URLS)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        newsInstance = retrofit.create(NewsInterface::class.java)

    }
}