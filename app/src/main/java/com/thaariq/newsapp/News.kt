package com.thaariq.newsapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class News (
    var title : String,
    var content : String,
    var date : String,
    var author : String,
    var time : String,
    var category : String,
    var photo : Int

        ):Parcelable