package com.example.latihan2_bloodshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
// tanggal pengerjaan : 2 Mei 2021 - 4 Mei 2021
// deskripsi : Membuat clone aplikasi blood share
// nama : Dedi Cahya
// Kelas : IF11K
// Nim : 10118901
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();

        setContentView(R.layout.activity_main);

        register_btn.setOnClickListener() {
            intent = Intent(this, SecondActivity::class.java);
            startActivity(intent);
        }


    }


}