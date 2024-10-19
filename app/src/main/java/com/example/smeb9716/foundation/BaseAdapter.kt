package com.example.smeb9716.foundation

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseAdapter<T, VB : ViewBinding>(
    private var items: List<T>
) : RecyclerView.Adapter<BaseAdapter.BaseViewHolder<VB>>() {

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(newItems: List<T>) {
        this.items = newItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<VB> {
        val binding = getViewBinding(LayoutInflater.from(parent.context), parent)
        return BaseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<VB>, position: Int) {
        val item = items[position]
        bind(holder.binding, item, position)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    protected abstract fun getViewBinding(inflater: LayoutInflater, parent: ViewGroup): VB
    protected abstract fun bind(binding: VB, item: T, position: Int)

    class BaseViewHolder<VB : ViewBinding>(val binding: VB) : RecyclerView.ViewHolder(binding.root)
}
