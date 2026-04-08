package com.example.tugas_kuliah_campus_event

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas_kuliah_campus_event.adapter.EventAdapter
import com.example.tugas_kuliah_campus_event.data.EventRepository
import com.example.tugas_kuliah_campus_event.ui.DetailEventActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val eventList = EventRepository.getEvents()

        val listView = findViewById<ListView>(R.id.lvEvents)
        val adapter = EventAdapter(this, eventList)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val clickedEvent = eventList[position]

            val intent = Intent(this, DetailEventActivity::class.java)
            intent.putExtra(DetailEventActivity.EXTRA_EVENT_ID, clickedEvent.id)
            startActivity(intent)
        }
    }
}