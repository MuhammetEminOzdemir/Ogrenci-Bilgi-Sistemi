package com.muham.ogrencibilgiisistemii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_kayit.*

class MainActivity : AppCompatActivity() {


    private lateinit var auth:FirebaseAuth  //Her yerde kullanacağımız class ın içinde private etmek bize kolaylık sağlar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth=FirebaseAuth.getInstance()  //firebase başlattık




    }

    fun girisYap(view: View){

        auth.signInWithEmailAndPassword(uyeTc.text.toString(),uyeTc.text.toString()).addOnCompleteListener { task->

            if(task.isSuccessful){

                val kullanici=auth.currentUser?.email.toString()
                Toast.makeText(this,"Hoşgeldiniz: ${kullanici}",Toast.LENGTH_LONG).show()

                val intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }.addOnFailureListener { exception ->
            Toast.makeText(this,exception.localizedMessage,Toast.LENGTH_LONG).show()
        }

    }

    fun kayitOl(view:View){

        val email=uyeEmail.text.toString()
        val tc=uyeEmail.text.toString()
        val phone=editTextPhone.text.toString()
        val adSoyad=uyeAd.text.toString()

        auth.createUserWithEmailAndPassword(tc,tc).addOnCompleteListener { task-> //giriş yapacağımız parametreleri seçtik
            // bu kod kısmı asenkron olarak çalışır
            if(task.isSuccessful){//eğer girişimiz başarılı ise
                val intent= Intent(this,kayitActivity::class.java)//diğer activity gidiş
                startActivity(intent)
                finish()
            }
        }.addOnFailureListener { exception -> //eğer girişimizde hata varsa
            Toast.makeText(applicationContext,exception.localizedMessage,Toast.LENGTH_LONG).show()
        }
    }
}