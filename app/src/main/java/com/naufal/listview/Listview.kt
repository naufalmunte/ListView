package com.naufal.listview

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Listview : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_listview)

        val lv_item = findViewById<ListView>(R.id.lvHewan)
        val namahewan = listOf("Gajah", "Ikan", "Ayam","Semut", "Kucing")
        lv_item.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namahewan)

        lv_item.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                this, "Anda Memilih : ${namahewan[position]}",
                Toast.LENGTH_SHORT
            ).show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}