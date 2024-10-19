package com.example.smeb9716.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.smeb9716.databinding.FragmentBookmarkBinding
import com.example.smeb9716.foundation.BaseFragment

class BookmarkFragment: BaseFragment<FragmentBookmarkBinding>() {
    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentBookmarkBinding {
        return FragmentBookmarkBinding.inflate(inflater, container, false)
    }

    override fun initEvents() {}

    override fun initObservers() {}

    override fun initViews(binding: FragmentBookmarkBinding) {}
}