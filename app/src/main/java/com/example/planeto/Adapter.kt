package com.example.planeto

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*

class Adapter(var planet: List<PlanetData>) : RecyclerView.Adapter<Adapter.myViewHolder>() {

    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title = view.title
        var planetimg = view.planet_img
        var galaxy = view.galaxy
        var distance = view.distance
        var gravity = view.gravity

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view, parent, false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage: Int? = null
        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,PlanetDetail::class.java)
            intent.putExtra("planet",planet[position])
            intent.putExtra("planetImage",dummyImage)
            holder.itemView.context.startActivity(intent)

        }
        holder.title.text = planet[position].title
        holder.galaxy.text = planet[position].galaxy
        holder.distance.text = planet[position].distance + " m km"
        holder.gravity.text = planet[position].title + " m/ss"

        when (planet[position].title!!.toLowerCase()) {
            "sun" -> {
                dummyImage = R.drawable.ic_sun
            }
            "mercury" -> {
                dummyImage = R.drawable.ic_mercury
            }
            "venus" -> {
                dummyImage = R.drawable.ic_venus
            }
            "earth" -> {
                dummyImage = R.drawable.ic_earth
            }
            "moon" -> {
                dummyImage = R.drawable.ic_moon
            }
            "mars" -> {
                dummyImage = R.drawable.ic_mars
            }
            "jupiter" -> {
                dummyImage = R.drawable.ic_jupiter
            }
            "saturn" -> {
                dummyImage = R.drawable.ic_saturn
            }
            "uranus" -> {
                dummyImage = R.drawable.ic_uranus
            }
            "neptune" -> {
                dummyImage = R.drawable.ic_neptune
            }
        }
        holder.planetimg.setImageResource(dummyImage!!)


    }

    override fun getItemCount(): Int {
        return planet.size
    }
}

