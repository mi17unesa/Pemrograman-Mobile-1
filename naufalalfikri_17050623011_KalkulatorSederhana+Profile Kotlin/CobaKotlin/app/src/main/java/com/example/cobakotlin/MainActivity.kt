package com.example.cobakotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.view.Window
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    
    val nama = "Naufal Al - Fikri"
    val nim = "17050623011"
    val prodi = "D3 Manajemen Informatika"
    val jurusan = "Teknik Informatika"
    private val title = "My Profile"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.setTitle(title)



        val tv1 = findViewById(R.id.tvnama) as TextView
        val tv2 = findViewById(R.id.tvnim) as TextView
        val tv3 = findViewById(R.id.tvprodi) as TextView
        val tv4 = findViewById(R.id.tvjurusan) as TextView
        val iv = findViewById(R.id.ivgambar) as ImageView

           tv1.setText(nama)
           tv2.setText(nim)
           tv3.setText(prodi)
           tv4.setText(jurusan)
           iv.setImageResource(R.drawable.nfl)
    }
}


