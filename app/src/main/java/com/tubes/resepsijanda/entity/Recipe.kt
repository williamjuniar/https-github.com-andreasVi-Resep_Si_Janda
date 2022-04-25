package com.tubes.resepsijanda.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Recipe(
    var name: String,
    var photo: String
) : Parcelable