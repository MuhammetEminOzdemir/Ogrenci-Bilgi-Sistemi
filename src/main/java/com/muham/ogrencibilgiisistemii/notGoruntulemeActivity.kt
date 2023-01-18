package com.muham.ogrencibilgiisistemii

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_ders_listeme.*

class notGoruntulemeActivity : AppCompatActivity() {

    private lateinit var auth:FirebaseAuth
    private lateinit var sharedPreferences:SharedPreferences  //sharedPrefences çalışması için ekleyelim verileri okuması için gerekli

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_not_goruntuleme)


        auth=FirebaseAuth.getInstance()

    }

    fun gosterNot(view:View){

        var gosterVize=sharedPreferences.getString("Vize: ","")
        var gosterFinal=sharedPreferences.getString("Final: ","")
        var gösterSonuc=sharedPreferences.getString("Sonuç: ","")
        textViewDersListe.text=gosterVize+' '+gosterFinal+'='+gösterSonuc


    }


}