package com.dicoding.top10epicgames

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Game(
    val name: String,
    val desc: String,
    val photo: Int
) : Parcelable
