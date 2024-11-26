package com.example.recyclerviewapp.mainview

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.R
import com.example.recyclerviewapp.mainview.adapter.SuperHeroAdapter

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_view)
        initRv()
    }

    private fun initRv() {
        val manager = LinearLayoutManager(this)
        val recyclerView = findViewById<RecyclerView>(R.id.rSuperHero)
        val decoration = DividerItemDecoration(this,manager.orientation)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList) { superhero ->
            onItemSelected(
                superhero
            )
        }
        recyclerView.addItemDecoration(decoration)
    }

    fun onItemSelected(superHero: SuperHero) {
        Toast.makeText(this,superHero.superhero,Toast.LENGTH_SHORT).show()
    }
}