package com.example.smeb9716.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.smeb9716.databinding.FragmentNotificationBinding
import com.example.smeb9716.foundation.BaseFragment

class NotificationFragment: BaseFragment<FragmentNotificationBinding>() {
    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentNotificationBinding {
        return FragmentNotificationBinding.inflate(inflater, container, false)
    }

    override fun initEvents() {}

    override fun initObservers() {}

    override fun initViews(binding: FragmentNotificationBinding) {}
}