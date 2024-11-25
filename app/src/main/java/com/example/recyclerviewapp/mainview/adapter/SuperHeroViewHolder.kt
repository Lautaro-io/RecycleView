package com.example.recyclerviewapp.mainview.adapter
import com.example.recyclerviewapp.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.mainview.SuperHero
import com.example.recyclerviewapp.mainview.SuperHeroProvider.Companion.superHeroList

class SuperHeroViewHolder(view: View): RecyclerView.ViewHolder(view){
    val superHero = view.findViewById<TextView>(R.id.spName)
    val realName = view.findViewById<TextView>(R.id.spRealName)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val photo = view.findViewById<ImageView>(R.id.imgViewSP)

    fun render(superHeroModel : SuperHero){
        superHero.text = superHeroModel.superhero
        realName.text = superHeroModel.realNane
        publisher.text = superHeroModel.publisher



    }
}