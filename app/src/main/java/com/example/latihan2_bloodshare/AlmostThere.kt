package com.example.latihan2_bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.almost_there_activity.*

// nama : Dedi Cahya
// Kelas : IF11K
// Nim : 10118901
class AlmostThere : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();

        setContentView(R.layout.almost_there_activity)

        btn_verify.setOnClickListener() {
            intent = Intent(this, Verify::class.java)
            startActivity(intent)
        }


    }
}