package com.example.smeb9716.viewmodel

import android.app.Application
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.smeb9716.R
import com.example.smeb9716.foundation.BaseViewModel


class UserViewModel(application: Application) : BaseViewModel(application) {
    companion object {
        private val TAG = UserViewModel::class.java.simpleName
    }

    private val imageUrl1 = "https://static3.bigstockphoto.com/4/2/3/large1500/324149785.jpg"
    private val imageUrl2 = "https://images.all-free-download.com/images/graphiclarge/fast_food_banner_template_elegant_contrast_6929952.jpg"
    private val imageUrl3 = "https://img.freepik.com/free-vector/hand-drawn-fast-food-sale-banner_23-2150970571.jpg"
    private val imageUrl4 = "https://png.pngtree.com/png-clipart/20210905/original/pngtree-fast-food-promotion-banner-png-image_6688034.jpg"
    private val imageUrl5 = "https://img.freepik.com/premium-photo/fast-food-restaurant-menu-social-media-marketing-web-banner-template-design-pizza_1197797-182348.jpg"

    val imageList = ArrayList<SlideModel>(
        listOf(
            SlideModel(imageUrl1, application.getString(R.string.slider_1), ScaleTypes.CENTER_CROP),
            SlideModel(imageUrl2, application.getString(R.string.slider_2)),
            SlideModel(imageUrl3, application.getString(R.string.slider_3)),
            SlideModel(imageUrl4, application.getString(R.string.slider_4)),
            SlideModel(imageUrl5, application.getString(R.string.slider_5))
        )
    )
}