package com.rochim.kulinear.ui.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rochim.kulinear.R

class NewsActivity : AppCompatActivity() {
    companion object{
        const val OPEN_NEWS = "open_news"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }
}