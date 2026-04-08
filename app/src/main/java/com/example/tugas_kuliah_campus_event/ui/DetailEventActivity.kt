package com.example.tugas_kuliah_campus_event.ui

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas_kuliah_campus_event.R
import com.example.tugas_kuliah_campus_event.data.EventRepository
import com.google.android.material.button.MaterialButton

class DetailEventActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_EVENT_ID = "extra_event_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_event)

        val btnBack = findViewById<MaterialButton>(R.id.btnBack)
        btnBack.setOnClickListener { finish() }

        val eventId = intent.getIntExtra(EXTRA_EVENT_ID, -1)

        val event = EventRepository.getEventById(eventId)

        if (event != null) {
            findViewById<TextView>(R.id.tvDetailTitle).text = event.namaEvent

            val formattedDesc = getString(
                R.string.format_detail_deskripsi,
                event.kategori,
                event.penyelenggara,
                event.tanggal,
                event.lokasi,
                event.deskripsi
            )
            findViewById<TextView>(R.id.tvDetailDesc).text = formattedDesc
            val ivBanner = findViewById<ImageView>(R.id.ivDetailBanner)
            ivBanner.setImageResource(event.imageResId)

            val btnRegister = findViewById<Button>(R.id.btnRegister)
            btnRegister.setOnClickListener {
                val successMessage = getString(R.string.toast_register_success, event.namaEvent)
                Toast.makeText(this@DetailEventActivity, successMessage, Toast.LENGTH_LONG).show()
            }
        } else {
            Toast.makeText(this, getString(R.string.toast_event_not_found), Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}