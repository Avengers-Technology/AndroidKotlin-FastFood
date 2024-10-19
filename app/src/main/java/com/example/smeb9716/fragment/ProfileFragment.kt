package com.example.smeb9716.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.smeb9716.databinding.FragmentProfileBinding
import com.example.smeb9716.foundation.BaseFragment

class ProfileFragment: BaseFragment<FragmentProfileBinding>() {
    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentProfileBinding {
        return FragmentProfileBinding.inflate(inflater, container, false)
    }

    override fun initEvents() {}

    override fun initObservers() {}

    override fun initViews(binding: FragmentProfileBinding) {}
}