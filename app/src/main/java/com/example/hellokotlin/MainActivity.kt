package com.example.hellokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() { //퍼블릭이 디폴트
//    var btnHello : Button

    override fun onCreate(savedInstanceState: Bundle?) { //데이터타입이 뒤로 / 패러매터이름 뒤에 물음포 = 널값을 처리해줄수 있다, 아무것도 안받고 처리할수있다
        super.onCreate(savedInstanceState) //세미콜론이 없음
        setContentView(R.layout.activity_main)

        val btnJava = findViewById<Button>(R.id.btnJava)
        val btnKotlin = findViewById<Button>(R.id.btnKotlin)

        var intent : Intent

        btnJava.setOnClickListener{
            intent = Intent(this@MainActivity, BmiJavaActivity::class.java)
            startActivity(intent)
        }
        btnKotlin.setOnClickListener {
            intent = Intent(this@MainActivity, BmiKotlinActivity::class.java)
            startActivity(intent)
        }
    }
}