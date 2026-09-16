package com.venus.activity_2.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    //    May yellow line po kaya inadd ko yung param hihi~
    @param:StringRes val stringResourceId: Int,
    @param:DrawableRes val imageResourceId: Int
)