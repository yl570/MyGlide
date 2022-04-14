package com.example.myapplication


import com.bumptech.glide.annotation.GlideExtension
import com.bumptech.glide.annotation.GlideOption

import com.bumptech.glide.request.BaseRequestOptions
import com.bumptech.glide.request.RequestOptions

/**
 * Created by YiLei 2022/4/14 8:46
 *
 */
@GlideExtension
object  MyGlideExtension {
    @JvmStatic
    @JvmOverloads
    @GlideOption
    fun cutRadius(options: BaseRequestOptions<*>, centerCrop: Boolean = true,roundingRadius: Int): BaseRequestOptions<*> {
        return options.transform(MyRoundedCorners(roundingRadius, roundingRadius))
    }
}