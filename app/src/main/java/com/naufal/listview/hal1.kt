package com.naufal.listview

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class hal1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hal1)

        val btnPasing = findViewById<Button>(R.id.btnPassingButton)
        val btnListview = findViewById<Button>(R.id.btnListview)

        val ActButton2 = findViewById<Button>(R.id.btnPassingButton)
        ActButton2.setOnClickListener {
            val Intent = Intent(this, Login::class.java)
            startActivity(Intent)
        }


        btnListview.setOnClickListener {
            val Intent = Intent(this, Listview::class.java)
            startActivity(Intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}