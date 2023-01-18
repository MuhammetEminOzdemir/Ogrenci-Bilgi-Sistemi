package com.muham.ogrencibilgiisistemii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_ders_ekleme.*
import kotlinx.android.synthetic.main.activity_yemek_listesi.*

class yemekListesiActivity : AppCompatActivity() {

    private lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yemek_listesi)
    }

    fun yemekEkle(view: View){

        //firebase ekleyelim

        val database= Firebase.database.reference

        val yemek=editTextYemekAd.text.toString()
        val yemekKalori=editTextKalori.text.toString().toInt()
        val tarih=editTextDate.text.toString().toInt()

        database.child("Yemek Adi: ").setValue(yemek)
        database.child("Yemek Kalori:").setValue(yemekKalori)
        database.child("Tarih: ").setValue(tarih)
    }

    fun geriDön(view: View){
        auth.signOut()
        val intent= Intent(this,yoneticiActivity::class.java)
        startActivity(intent)
        finish()
    }

}