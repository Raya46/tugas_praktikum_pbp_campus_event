package com.example.tugas_kuliah_campus_event.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.tugas_kuliah_campus_event.R
import com.example.tugas_kuliah_campus_event.model.EventItem

class EventAdapter(context: Context, private val events: List<EventItem>) :
    ArrayAdapter<EventItem>(context, 0, events) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_event, parent, false)
        val event = events[position]

        val ivIcon = view.findViewById<ImageView>(R.id.ivEventIcon)
        val tvTitle = view.findViewById<TextView>(R.id.tvItemTitle)
        val tvCategory = view.findViewById<TextView>(R.id.tvItemCategory)
        val tvDate = view.findViewById<TextView>(R.id.tvItemDate)

        ivIcon.setImageResource(event.imageResId)
        tvTitle.text = event.namaEvent
        tvCategory.text = event.kategori
        tvDate.text = "${event.tanggal} • ${event.lokasi}"

        return view
    }
}