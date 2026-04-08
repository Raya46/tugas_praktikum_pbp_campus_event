package com.example.tugas_kuliah_campus_event.ui

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas_kuliah_campus_event.R
import com.example.tugas_kuliah_campus_event.adapter.EventAdapter
import com.example.tugas_kuliah_campus_event.data.EventRepository

class EventListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_list)

        val eventList = EventRepository.getEvents()
        val listView = findViewById<ListView>(R.id.lvEvents)

        val adapter = EventAdapter(this, eventList)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val clickedEvent = eventList[position]
            val intent = Intent(this, EventDetailActivity::class.java)

            intent.putExtra(EventDetailActivity.EXTRA_EVENT_ID, clickedEvent.id)
            startActivity(intent)
        }
    }
}