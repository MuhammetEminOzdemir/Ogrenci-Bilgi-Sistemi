package com.muham.ogrencibilgiisistemii

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_ders_listeme.*

class dersListemeActivity : AppCompatActivity() {

    private lateinit var auth:FirebaseAuth
    private lateinit var sharedPreferences:SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ders_listeme)

        auth=FirebaseAuth.getInstance()


    }


fun gosterDers(view: View){

    var gosterDers=sharedPreferences.getString("Ders Adi","")
    var gosterKod=sharedPreferences.getString("Ders Adi","")
    textViewDersListe.text=gosterDers+' '+gosterKod

}

}