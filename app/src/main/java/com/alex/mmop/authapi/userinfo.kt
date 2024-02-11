package com.alex.mmop.authapi

import com.google.errorprone.annotations.Keep


@Keep
data class userinfo(
    val userkey : String,
    val androidid : String,
    val devicemodel : String,
    val devicebrand : String
)
