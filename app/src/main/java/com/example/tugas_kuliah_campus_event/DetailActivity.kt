package com.example.tugas_kuliah_campus_event

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class DetailEventActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_event)

        val tvTitle = findViewById<TextView>(R.id.tvDetailTitle)
        val tvDesc = findViewById<TextView>(R.id.tvDetailDesc)

        val title = intent.getStringExtra("EXTRA_TITLE") ?: "Detail Kegiatan"
        val desc = intent.getStringExtra("EXTRA_DESC") ?: "Belum ada deskripsi."

        tvTitle.text = title
        tvDesc.text = desc

        val btnBack = findViewById<MaterialButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }
    }
}