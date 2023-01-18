package com.muham.ogrencibilgiisistemii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_ders_ekleme.*
import kotlinx.android.synthetic.main.activity_duyuru.*

class duyuruActivity : AppCompatActivity() {

    private lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_duyuru)

        auth=FirebaseAuth.getInstance()
    }

    fun geriDon(view: View){

        auth.signOut()
        val intent= Intent(this,yoneticiActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun duyuruEkle(view: View){

        //firebase ekleyelim

        val database= Firebase.database.reference

        val duyuruB=editTextDuyuruBaşlık.text.toString()
        val duyuruA=editTextDuyuruAçıklama.text.toString()
        val duyuruT=editTextDate2.text.toString()

        database.child("Duyuru Adi: ").setValue(duyuruB)
        database.child("Duyuru Açiklamasi: ").setValue(duyuruA)
        database.child("Duyuru Tarihi: ").setValue(duyuruT)

    }
}