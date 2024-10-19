package com.example.smeb9716.fragment

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.smeb9716.activities.NotificationAct
import com.example.smeb9716.databinding.FragmentHomeBinding
import com.example.smeb9716.foundation.BaseFragment
import com.example.smeb9716.utils.Utils
import com.example.smeb9716.viewmodel.UserViewModel

class HomeFragment: BaseFragment<FragmentHomeBinding>() {
    private val userViewModel: UserViewModel by viewModels()

    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, container, false)
    }

    override fun initEvents() {
        binding.headerHome.imvNotification.setOnClickListener {
            openNotificationAct()
        }
    }

    override fun initObservers() {
        userViewModel.users.observe(viewLifecycleOwner) { res ->
            Utils.showToastSystem(requireContext(), res?.size.toString())
        }
    }

    override fun initViews(binding: FragmentHomeBinding) {
        userViewModel.getUsers()
    }

    private fun openNotificationAct() {
        val intent = Intent(requireContext(), NotificationAct::class.java)
        startActivity(intent)
    }
}