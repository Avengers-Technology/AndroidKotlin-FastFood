package com.example.smeb9716.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.smeb9716.databinding.FragmentGiftBinding
import com.example.smeb9716.foundation.BaseFragment

class GiftFragment: BaseFragment<FragmentGiftBinding>() {
    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentGiftBinding {
        return FragmentGiftBinding.inflate(inflater, container, false)
    }

    override fun initEvents() {}

    override fun initObservers() {}

    override fun initViews(binding: FragmentGiftBinding) {}
}