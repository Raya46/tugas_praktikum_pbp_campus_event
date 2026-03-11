package com.example.tugas_kuliah_campus_event

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDetailUnggulan = findViewById<Button>(R.id.btnDetail)
        btnDetailUnggulan?.setOnClickListener {
            val intent = Intent(this, DetailEventActivity::class.java)
            intent.putExtra("EXTRA_TITLE", "Tech Talk: Implementasi AI dalam Fintech")
            intent.putExtra("EXTRA_DESC", "Bergabunglah dalam Tech Talk eksklusif ini untuk membahas bagaimana Artificial Intelligence mengubah industri finansial. \n\nPembicara: Dr. Budi Santoso (AI Researcher)\nLokasi: Auditorium Kampus\nWaktu: 09.00 - 12.00 WIB\n\nKuota terbatas, segera daftarkan dirimu!")
            startActivity(intent)
        }

        val btnDetailLainnya = findViewById<Button>(R.id.btnDetail2)
        btnDetailLainnya?.setOnClickListener {
            val intent = Intent(this, DetailEventActivity::class.java)
            intent.putExtra("EXTRA_TITLE", "Workshop UI/UX Design")
            intent.putExtra("EXTRA_DESC", "Belajar membuat prototipe interaktif menggunakan Figma dari nol. Terbuka untuk mahasiswa semua jurusan!\n\nPemateri: Jane Doe (Senior Product Designer)\nLokasi: Lab Komputer 1\nWaktu: 13.00 - 15.00 WIB")
            startActivity(intent)
        }
    }
}