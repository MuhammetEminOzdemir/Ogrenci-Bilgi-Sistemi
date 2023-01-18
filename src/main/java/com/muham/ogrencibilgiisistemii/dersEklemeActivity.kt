package com.muham.ogrencibilgiisistemii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_ders_ekleme.*

class dersEklemeActivity : AppCompatActivity() {

    private lateinit var auth:FirebaseAuth
    private lateinit var database:DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ders_ekleme)

        auth=FirebaseAuth.getInstance()

    }

    fun dersEkle(view: View){

        //firebase ekleyelim

        val database=Firebase.database.reference

        val ders=editTextDersAd.text.toString()
        val dersKod=editTextDersKod.text.toString()

        database.child("Ders Adi").setValue(ders)
        database.child("Ders Kod").setValue(dersKod)

    }

    fun geriDön(view: View){
        auth.signOut()
        val intent=Intent(this,yoneticiActivity::class.java)
        startActivity(intent)
        finish()
    }
}