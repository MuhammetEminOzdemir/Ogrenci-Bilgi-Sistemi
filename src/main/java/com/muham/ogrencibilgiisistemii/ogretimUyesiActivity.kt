package com.muham.ogrencibilgiisistemii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ogretimUyesiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ogretim_uyesi)
    }

    fun cikisYap(view: View){

        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun dersListeleme(view:View){

        val intent=Intent(this,dersListemeActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun notGirme(view:View){

        val intent=Intent(this,NotHesaplamaActivity::class.java)
        startActivity(intent)
        finish()

    }

    fun duyuru(view: View){

        val intent=Intent(this,duyuruActivity::class.java)
        startActivity(intent)
        finish()
    }

}