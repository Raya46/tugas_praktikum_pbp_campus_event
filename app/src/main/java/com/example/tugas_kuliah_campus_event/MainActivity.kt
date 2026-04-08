package com.example.tugas_kuliah_campus_event

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas_kuliah_campus_event.ui.EventListActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnExplore = findViewById<Button>(R.id.btnExplore)
        btnExplore.setOnClickListener {
            // Berpindah dari Dashboard ke Daftar Event
            val intent = Intent(this, EventListActivity::class.java)
            startActivity(intent)
        }
    }
}