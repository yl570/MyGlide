package com.example.myapplication

import android.graphics.drawable.Drawable
import android.util.Log
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import java.lang.Exception

/**
 * Created by YiLei 2022/4/14 13:28
 *
 */
object Utils {
    fun GlideRequest<*>.miniThumb(size: Int): GlideRequest<*> {
        return this.fitCenter()
            .override(100)
    }

    fun GlideRequests.loadThumb(s: String): GlideRequest<*> {
        //val url="$s?x-oss-process=style/app-main-item"
        val url="$s"
        return this.load(url).addListener(
            object : RequestListener<Drawable?> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Drawable?>?,
                    isFirstResource: Boolean
                ): Boolean {
                    Log.v("加载的压缩图失败",url)
                    return false
                }

                override fun onResourceReady(
                    resource: Drawable?,
                    model: Any?,
                    target: Target<Drawable?>?,
                    dataSource: DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    Log.v("加载的压缩图成功",url+"(${resource?.getIntrinsicWidth()}，${resource?.getIntrinsicHeight()})")
                    return false
                }

            }
        )

    }
}