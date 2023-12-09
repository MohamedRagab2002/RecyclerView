package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.model.Flower

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<Flower>()

        data.add(Flower(R.drawable.lutas, name = "lutas", season = "winter"))
        data.add(Flower(R.drawable.sun, name = "sun", season = "spring"))

        val adapter = FlowerAdapter(data)
        recyclerView.adapter = adapter
    }
}