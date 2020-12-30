package com.rochim.kulinear.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class News(
    val title: String = "",
    val thumb: String = "",
    val key: String = "",
    val times: String = "",
    val portion: String = "",
    val dificulty: String = ""

) : Parcelable
