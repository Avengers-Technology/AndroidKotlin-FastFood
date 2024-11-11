package com.example.smeb9716.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.smeb9716.databinding.ItemUserBinding
import com.example.smeb9716.foundation.BaseAdapter
import com.example.smeb9716.model.User

class UserAdapter(
    private val items: List<User>,
    private val context: Context
) : BaseAdapter<User, ItemUserBinding>(items) {

    override fun getViewBinding(inflater: LayoutInflater, parent: ViewGroup): ItemUserBinding {
        return ItemUserBinding.inflate(inflater, parent, false)
    }

    override fun bind(binding: ItemUserBinding, item: User, position: Int) {
        binding.tvName.text = "item.title"
        binding.tvEmail.text = "item.body"
    }
}