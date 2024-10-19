package com.example.smeb9716

import androidx.fragment.app.Fragment
import com.example.smeb9716.databinding.ActivityMainBinding
import com.example.smeb9716.foundation.BaseActivity
import com.example.smeb9716.foundation.BaseDialog
import com.example.smeb9716.fragment.BookmarkFragment
import com.example.smeb9716.fragment.FavoriteFragment
import com.example.smeb9716.fragment.HomeFragment
import com.example.smeb9716.fragment.ProfileFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        // Init HomeFragment
        setCurrentFragment(HomeFragment())

        //Set up BottomNavigationView
        binding.bottomNavigation.itemIconTintList = null

    }

    override fun initEvents() {
        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.bottomBarHome -> {
                    setCurrentFragment(HomeFragment())
                    true
                }
                R.id.bottomBarFavorite -> {
                    setCurrentFragment(FavoriteFragment())
                    true
                }
                R.id.bottomBarBookmark -> {
                    setCurrentFragment(BookmarkFragment())
                    true
                }
                R.id.bottomBarProfile -> {
                    setCurrentFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }
    }

    override fun initObservers() {

    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayoutContainer, fragment)
            .addToBackStack(null)
            .commit()
    }

}