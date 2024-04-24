package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.myapplication.databinding.ActivityAdapterViewBinding

class AdapterView(val arr: ArrayList<data>): RecyclerView.Adapter<AdapterView.MyViewHolder>() {

    class MyViewHolder(var binding: ActivityAdapterViewBinding): ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(ActivityAdapterViewBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return arr.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val arr = arr[position]
        holder.binding.name.text = arr.name
        holder.binding.number.text = arr.number
    }

}