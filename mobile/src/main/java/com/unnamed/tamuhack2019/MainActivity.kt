package com.unnamed.tamuhack2019

import android.os.Bundle
import android.os.Handler
import com.google.android.material.snackbar.Snackbar
import androidx.core.content.ContextCompat
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        done.setOnClickListener {
//
//        }
//
//        help.setOnClickListener {
//
//        }
        progressBar.max = 100
        progressBar.min = 0
        progressBar.progress = progressBar.min
        //progressBar.scaleY = 3f
        progressBar.scaleX = 1.5F

        progressButton.setOnClickListener {
            progressBar.incrementProgressBy(1)
        }
    }


}
