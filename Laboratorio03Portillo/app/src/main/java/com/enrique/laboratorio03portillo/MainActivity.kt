package com.enrique.laboratorio03portillo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var fiveCentsImageView : ImageView
    private lateinit var tenCentsImageView: ImageView
    private lateinit var quarterCentsImageView: ImageView
    private lateinit var dollarImageView: ImageView
    private lateinit var cashTextView: TextView

    private var cash = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()


        fiveCentsImageView.setOnClickListener {
            cash += 0.05
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }

        tenCentsImageView.setOnClickListener {
            cash += 0.10
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }

        quarterCentsImageView.setOnClickListener {
            cash += 0.25
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }

        dollarImageView.setOnClickListener {
            cash += 1.00
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }

    }

    private fun bind() {
        fiveCentsImageView = findViewById(R.id.five_cents_image_view)
        tenCentsImageView = findViewById(R.id.ten_cent_image_view)
        quarterCentsImageView = findViewById(R.id.quarter_cent_image_view)
        dollarImageView = findViewById(R.id.dollar_image_view)
        cashTextView = findViewById(R.id.cash_text_view)
    }
}