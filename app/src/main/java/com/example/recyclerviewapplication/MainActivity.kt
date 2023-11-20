package com.example.recyclerviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

  private lateinit var recyclerView: RecyclerView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    recyclerView = findViewById(R.id.recyclerView)

    val mLayoutManager = LinearLayoutManager(this)
    val mAdapter = GreenAdapter()

    recyclerView.apply {
      layoutManager = mLayoutManager
      setHasFixedSize(true)
      adapter = mAdapter
    }
  }
}