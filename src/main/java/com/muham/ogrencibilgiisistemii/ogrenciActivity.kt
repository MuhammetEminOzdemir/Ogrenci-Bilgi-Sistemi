package com.muham.ogrencibilgiisistemii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.google.firebase.auth.FirebaseAuth

class ogrenciActivity : AppCompatActivity() {

    private lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ogrenci)

        auth=FirebaseAuth.getInstance()

    }

    //yapmış olduğumuz menüyü bağlamak için gerekli kodlar
    //hem menü şekllinde hemde noraml olarak gidebilir

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val menuInflater=menuInflater
        menuInflater.inflate(R.menu.menu,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //burada hagi item yani hangi seçenek seçilirse  ne yapacağımız anlatılır
        if(item.itemId==R.id.ders_listeleme){

            val intent=Intent(this,dersListemeActivity::class.java)
            startActivity(intent)

        } else if(item.itemId==R.id.not_goruntuleme){
            val intent=Intent(this,notGoruntulemeActivity::class.java) // eğer o menüden çıkarsa öğreni activitye geri gelcek
            startActivity(intent)
            finish()
        } else if(item.itemId==R.id.yemek_listesi){
            val intent=Intent(this,yemekListesiActivity::class.java) // eğer o menüden çıkarsa öğreni activitye geri gelcek
            startActivity(intent)
            finish()
        }else if(item.itemId==R.id.duyurular){
            auth.signOut()
            val intent=Intent(this,duyuruActivity::class.java) // eğer o menüden çıkarsa öğreni activitye geri gelcek
            startActivity(intent)
            finish()
        }else if(item.itemId==R.id.cik){
            val intent=Intent(this,MainActivity::class.java) // eğer o menüden çıkarsa öğreni activitye geri gelcek
            startActivity(intent)
            finish()
        }

        return super.onOptionsItemSelected(item)
    }

    fun dersListeleme(view: View){
        val intent=Intent(this,dersListemeActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun notGoster(view: View){

        val intent=Intent(this,notGoruntulemeActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun yemekListesi(view: View){
        val intent=Intent(this,yemekListesiActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun duyuru(view: View){
        val intent=Intent(this,duyuruActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun cikisYap(view: View){

        auth.signOut()
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}