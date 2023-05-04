package com.mamedov.recyclerviewpodklyucheniye

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.mamedov.recyclerviewpodklyucheniye.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding1: ActivityMainBinding  //defining the binding class

    override fun onCreate(savedInstanceState: Bundle?) {
        binding1 = ActivityMainBinding.inflate(layoutInflater) //initializing the binding class

        super.onCreate(savedInstanceState)
        setContentView(binding1.root) // we now set the contentview as the binding.root
        //setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = MyAdapter()
        recyclerView.adapter = adapter
    }
}