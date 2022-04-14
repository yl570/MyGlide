package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.example.myapplication.Utils.loadThumb
import com.example.myapplication.Utils.miniThumb
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //GlideApp.with()
        GlideApp.with(this).loadThumb("http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/86261117-9e34-4660-a43d-1d95c498d059.png").into(Im_test)
        Log.v("MainActivity",
            Glide.with(this)
                .toString(),Exception())

    }

}








