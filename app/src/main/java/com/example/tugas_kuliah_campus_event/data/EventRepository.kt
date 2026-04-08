package com.example.tugas_kuliah_campus_event.data

import com.example.tugas_kuliah_campus_event.R
import com.example.tugas_kuliah_campus_event.model.EventItem

object EventRepository {
    private val eventList = listOf(
        EventItem(
            id = 1,
            namaEvent = "Tech Talk: Implementasi AI dalam Fintech",
            penyelenggara = "BEM FIK UPNVJ",
            tanggal = "15 Mei 2026, 09.00 WIB",
            lokasi = "Auditorium Bhinneka Tunggal Ika",
            deskripsi = "Bergabunglah dalam Tech Talk eksklusif ini untuk membahas bagaimana Artificial Intelligence mengubah industri finansial modern. Kuota terbatas!",
            imageResId = R.drawable.techtalk,
            kategori = "Seminar"
        ),
        EventItem(
            id = 2,
            namaEvent = "Workshop UI/UX Design with Figma",
            penyelenggara = "Himpunan Mahasiswa Informatika",
            tanggal = "20 Mei 2026, 13.00 WIB",
            lokasi = "Lab Komputer Terpadu",
            deskripsi = "Belajar membuat prototipe interaktif menggunakan Figma dari nol bersama praktisi industri. Terbuka untuk mahasiswa semua jurusan!",
            imageResId =R.drawable.workshopfigma,
            kategori = "Workshop"
        ),
        EventItem(
            id = 3,
            namaEvent = "Hackathon Nasional: Smart City",
            penyelenggara = "Kementerian Ristek BEM",
            tanggal = "1-2 Juni 2026",
            lokasi = "Gedung Fakultas Ilmu Komputer",
            deskripsi = "Kompetisi ngoding 24 jam untuk menciptakan solusi inovatif berbasis IoT dan AI untuk kota pintar. Hadiah total jutaan rupiah!",
            imageResId = R.drawable.hackathon,
            kategori = "Lomba"
        ),
        EventItem(
            id = 4,
            namaEvent = "Open Recruitment: UKM Veteran Tech",
            penyelenggara = "UKM Veteran Tech UPNVJ",
            tanggal = "10 Juni 2026, 15.00 WIB",
            lokasi = "Sekretariat UKM Gedung C",
            deskripsi = "Mari bergabung dan kembangkan minatmu di bidang robotika dan sistem tertanam. Tidak butuh pengalaman ngoding sebelumnya!",
            imageResId = R.drawable.veterantech,
            kategori = "Organisasi"
        )
    )

    fun getEvents(): List<EventItem> {
        return eventList
    }

    fun getEventById(id: Int): EventItem? {
        return eventList.find { it.id == id }
    }
}