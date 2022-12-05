package com.example.myapplication

import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sdf = SimpleDateFormat("dd/MM/yyyy")
        val currentDate = sdf.format(Date())

        findViewById<TextView>(R.id.textView).text=currentDate

        findViewById<CalendarView>(R.id.calendarView).setOnDateChangeListener { calendarView, dzien, miesiac, rok ->
            var dat=(dzien.toString()+"-"+miesiac.toString()+"-"+rok.toString())
            findViewById<TextView>(R.id.textView).text=dat
        }


    }
}