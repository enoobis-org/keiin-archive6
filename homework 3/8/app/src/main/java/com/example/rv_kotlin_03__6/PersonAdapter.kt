package com.example.rv_kotlin_03__6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.rv_kotlin_03__6.databinding.ItemListBinding

class PersonAdapter(private var personList : ArrayList<Persons>) : Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(personList[position])
    }

}

open class ViewHolder(private var binding: ItemListBinding) :RecyclerView.ViewHolder(binding.root) {
    fun bind(person : Persons) {
        binding.tvText1.text = person.name
        binding.tvText2.text = person.post
        Glide.with(binding.root).load(person.image).into(binding.imgPhoto)
    }
}
