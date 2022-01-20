package com.example.securitybreachringtone.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.securitybreachringtone.R
import com.example.securitybreachringtone.main.model.MainPlayerModel

class MainPlayerAdapter:RecyclerView.Adapter<MainPlayerAdapter.MainPlayerViewHolder>() {
var list= mutableListOf<MainPlayerModel>()

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainPlayerViewHolder {

       val view:View=LayoutInflater.from(parent.context).inflate(R.layout.main_player_item,parent,false)


       return MainPlayerViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainPlayerViewHolder, position: Int) {




       holder.image.setImageResource(list[position].image!!)
       holder.nameText.text=list[position].nameText
       holder.descriptionText.text=list[position].descriptionText




    }

    override fun getItemCount(): Int {
return list.size
    }

    class MainPlayerViewHolder(view:View):RecyclerView.ViewHolder(view){

        var image=view.findViewById<ImageView>(R.id.image_id)
        var nameText:TextView=view.findViewById(R.id.name_id)
        var descriptionText:TextView=view.findViewById(R.id.description_id)

    }

fun update(list:MutableList<MainPlayerModel>){
    this.list=list
    notifyDataSetChanged()

}
}