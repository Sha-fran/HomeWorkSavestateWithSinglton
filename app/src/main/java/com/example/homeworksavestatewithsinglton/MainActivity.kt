package com.example.homeworksavestatewithsinglton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView:TextView = findViewById(R.id.text_view)
        val fab:FloatingActionButton = findViewById(R.id.fab)

        if (NumberHolder.numberOfClicks != 0) {
            textView.text = NumberHolder.numberOfClicks.toString()
        }

        fab.setOnClickListener {
            NumberHolder.addNumber()
            textView.text = NumberHolder.numberOfClicks.toString()
        }
    }
}
