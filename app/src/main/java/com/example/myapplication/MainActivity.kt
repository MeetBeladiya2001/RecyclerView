package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: com.example.myapplication.AdapterView
    private val arr =  ArrayList<data>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        adapter = AdapterView(arr)
        binding.recView.adapter = adapter
        binding.recView.layoutManager = LinearLayoutManager(this)

        arr.add(data("Meet","8200761610"))
        arr.add(data("Milan","9542321445"))
        arr.add(data("Parth","9451623467"))
        arr.add(data("Rohan","8154267382"))
        arr.add(data("Swami","6491526344"))
        arr.add(data("Manthan","7990146809"))
        arr.add(data("Vivek","7201020801"))

    }
}