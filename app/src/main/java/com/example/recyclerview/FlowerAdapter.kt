package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.model.Flower

class FlowerAdapter(private val dataSet : List<Flower>) : RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder>() {

    class FlowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val image : ImageView
        val flowerName : TextView
        val flowerSeason : TextView

        init {
            image = itemView.findViewById(R.id.img_flower)
            flowerName = itemView.findViewById(R.id.txt_flower_name)
            flowerSeason = itemView.findViewById(R.id.txt_season)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.flower_item_view,parent,false)
        return FlowerViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
       holder.image.setImageResource(dataSet[position].image)
       holder.flowerName.text = dataSet[position].name
        holder.flowerSeason.text = dataSet[position].season
    }
}