package com.route.notesapplicationgfric33

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.os.HandlerCompat

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler()
            .postDelayed({
                startActivity(Intent(this,HomeActivity::class.java))
                finish()
            },2000)
    }
}