package com.example.dummyproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlinx.android.synthetic.main.example_item.view.*

class ExampleAdapter(val context: Context, private val exampleList : List<Article>
) : RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.example_item,parent,false)
        return ExampleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]
        //holder.mImageView.setImageResource(currentItem.imageResource)
        holder.mTextView1.text = currentItem.title
        holder.mTextView2.text = currentItem.description

    }

    override fun getItemCount(): Int = exampleList.size

     inner class ExampleViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView),OnClickListener{
        val mImageView : ImageView = itemView.image_view
        val mTextView1 : TextView = itemView.text_view
        val mTextView2 : TextView = itemView.text_view1

         val Id: TextView = itemView.text_view
         var title: TextView = itemView.text_view1


         init {
             itemView.setOnClickListener(this)
         }

         override fun onClick(p0: View?) {

             val position = bindingAdapterPosition
             if (position != RecyclerView.NO_POSITION) {

             }

         }


     }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }






}









