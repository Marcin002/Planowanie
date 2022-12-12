package com.example.myapplication

import android.os.Bundle
import android.widget.Button
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
                findViewById<Button>(R.id.poczatek)
                val dat1=(rok.toString()+"-"+(miesiac+1).toString()+"-"+dzien.toString())
                findViewById<TextView>(R.id.textView).text=dat1
                findViewById<Button>(R.id.poczatek).setOnClickListener {
                    val dat2=(rok.toString()+"-"+(miesiac+1).toString()+"-"+dzien.toString())
                    findViewById<TextView>(R.id.wyjazd).text=dat2
                }
                findViewById<Button>(R.id.koniec).setOnClickListener {
                    val dat3=(rok.toString()+"-"+(miesiac+1).toString()+"-"+dzien.toString())
                    findViewById<TextView>(R.id.przyjazd).text=dat3
                }

        }
   }
}