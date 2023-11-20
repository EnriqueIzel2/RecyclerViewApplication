package com.example.recyclerviewapplication

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), GreenAdapter.NumberOnCLickListener {

  private lateinit var recyclerView: RecyclerView
  private lateinit var mAdapter: GreenAdapter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)


    recyclerView = findViewById(R.id.recyclerView)

    val mLayoutManager = LinearLayoutManager(this)
    mAdapter = GreenAdapter(LIST_SIZE, this)

    recyclerView.apply {
      layoutManager = mLayoutManager
      setHasFixedSize(true)
      adapter = mAdapter
    }
  }

  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    val menuResID = R.menu.menu_main
    menuInflater.inflate(menuResID, menu)

    return true
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    val menuID = item.itemId
    if (menuID == R.id.action_refresh) {
      mAdapter = GreenAdapter(LIST_SIZE, this)
      recyclerView.adapter = mAdapter
      return true
    }
    return super.onOptionsItemSelected(item)
  }

  override fun onClick(value: String) {
    Log.e("Main", "cliquei")
  }

  companion object {
    const val LIST_SIZE = 100
  }
}