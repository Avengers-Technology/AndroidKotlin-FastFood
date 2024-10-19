package com.example.smeb9716.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.smeb9716.databinding.FragmentFavoriteBinding
import com.example.smeb9716.foundation.BaseFragment

class FavoriteFragment: BaseFragment<FragmentFavoriteBinding>() {
    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentFavoriteBinding {
        return FragmentFavoriteBinding.inflate(inflater, container, false)
    }

    override fun initEvents() {}

    override fun initObservers() {}

    override fun initViews(binding: FragmentFavoriteBinding) {}
}