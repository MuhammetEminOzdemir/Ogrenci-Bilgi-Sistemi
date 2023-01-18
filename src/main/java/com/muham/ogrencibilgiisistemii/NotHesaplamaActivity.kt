package com.muham.ogrencibilgiisistemii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import com.muham.ogrencibilgiisistemii.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_not_hesaplama.*

class NotHesaplamaActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_not_hesaplama)

        auth=FirebaseAuth.getInstance()

    }

    fun geriDön(view: View){

        val intent= Intent(this,ogretimUyesiActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun Hesapla(view: View){

        val vize=editTextVize.text.toString().toInt()
        val final=editTextFinal.text.toString().toInt()
        var sonuc:Double=(vize*0.5)+(final*0.5).toDouble()

        if (sonuc>=85){
            sonucTextView.text="Sonuç: ${sonuc}, Harf Notu: AA"
        }else if(sonuc<85 && sonuc>=75){
            sonucTextView.text="Sonuç: ${sonuc}, Harf Notu: BA"
        }else if(sonuc<75 && sonuc >=70){
            sonucTextView.text="Sonuç: ${sonuc}, Harf Notu: BB"
        }else if(sonuc<70 && sonuc >=60){
            sonucTextView.text="Sonuç: ${sonuc}, Harf Notu: BC"
        }else if(sonuc<60 && sonuc>=45){
            sonucTextView.text="Sonuç: ${sonuc}, Harf Notu: CC"
        }else{
            sonucTextView.text="Sonuç: ${sonuc}, Harf Notu: FF"
        }
    }
}