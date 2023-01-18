package com.muham.ogrencibilgiisistemii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class yoneticiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yonetici)
    }

    fun cikisYap(view: View){
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun yemekListesi(view: View){
        val intent=Intent(this,yemekListesiActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun dersEkleme(view: View){
        val intent=Intent(this,dersEklemeActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun duyuru(view: View){
        val intent=Intent(this,duyuruActivity::class.java)
        startActivity(intent)
        finish()
    }
}