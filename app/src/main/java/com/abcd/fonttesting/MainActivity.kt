package com.abcd.fonttesting

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {

    private lateinit var editMessage: EditText
    private lateinit var txtSample1: TextView
    private lateinit var txtSample2: TextView
    private lateinit var txtSample3: TextView
    private lateinit var txtSample4: TextView
    private lateinit var txtSampleMontserrat: TextView
    private lateinit var txtSampleCard: TextView
    private lateinit var txtSampleCard2: TextView
    private lateinit var txtSampleCard3: TextView
    private lateinit var txtSampleCard4: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        updateSamples()
    }

    private fun initViews() {
        editMessage = findViewById(R.id.editMessage)
        txtSample1 = findViewById(R.id.txtSample1)
        txtSample2 = findViewById(R.id.txtSample2)
        txtSample3 = findViewById(R.id.txtSample3)
        txtSample4 = findViewById(R.id.txtSample4)
        txtSampleMontserrat = findViewById(R.id.sampleMontserrat)
        txtSampleCard = findViewById(R.id.txtSampleCard)
        txtSampleCard2 = findViewById(R.id.txtSampleCard2)
        txtSampleCard3 = findViewById(R.id.txtSampleCard3)
        txtSampleCard4 = findViewById(R.id.txtSampleCard4)

        editMessage.requestFocus()
    }

    private fun updateSamples() {
        editMessage.addTextChangedListener {
            txtSample1.text = it.toString()
            txtSample2.text = it.toString()
            txtSample3.text = it.toString()
            txtSample4.text = it.toString()
            txtSampleMontserrat.text = it.toString()
            txtSampleCard.text = it.toString()
            txtSampleCard2.text = it.toString()
            txtSampleCard3.text = it.toString().lowercase()
            txtSampleCard4.text = it.toString().lowercase()
        }
    }
}
