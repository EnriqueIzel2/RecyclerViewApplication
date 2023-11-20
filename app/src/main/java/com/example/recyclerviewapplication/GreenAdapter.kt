package com.example.recyclerviewapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GreenAdapter : RecyclerView.Adapter<GreenAdapter.NumberViewHolder>() {
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GreenAdapter.NumberViewHolder {
    val context = parent.context
    val inflater = LayoutInflater.from(context)
    val layoutResID = R.layout.number_list_item

    val view = inflater.inflate(layoutResID, parent, false)

    return NumberViewHolder(view)
  }

  override fun getItemCount(): Int {
    TODO("Not yet implemented")
  }

  override fun onBindViewHolder(holder: GreenAdapter.NumberViewHolder, position: Int) {
    TODO("Not yet implemented")
  }

  inner class NumberViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private var numberTextView: TextView

    init {
      numberTextView = view.findViewById(R.id.text_item_number)
    }

    fun bind(textValue: String) {
      numberTextView.text = textValue
    }
  }
}