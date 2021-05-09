package com.shikechen.purekotlinandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shikechen.purekotlinandroid.chapter3.FirstActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_chapter3.setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }
    }
}