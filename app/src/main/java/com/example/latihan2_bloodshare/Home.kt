package com.example.latihan2_bloodshare

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
// nama : Dedi Cahya
// Kelas : IF11K
// Nim : 10118901
class Home:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();

        setContentView(R.layout.home_activity)

    }
}