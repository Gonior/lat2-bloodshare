package com.example.latihan2_bloodshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.second_activity.*
import android.content.Intent

// nama : Dedi Cahya
// Kelas : IF11K
// Nim : 10118901

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();

        setContentView(R.layout.second_activity)

        toAlmostThere.setOnClickListener() {
            intent = Intent(this, AlmostThere::class.java )
            startActivity((intent))
        }
    }
}