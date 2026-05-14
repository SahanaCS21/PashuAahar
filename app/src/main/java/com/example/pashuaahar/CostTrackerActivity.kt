package com.example.pashuaahar

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CostTrackerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cost_tracker)

        val etFeedName = findViewById<EditText>(R.id.etFeedName)
        val etQuantity = findViewById<EditText>(R.id.etQuantity)
        val etCost = findViewById<EditText>(R.id.etCost)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnCalculate.setOnClickListener {

            val feedName = etFeedName.text.toString()
            val quantity = etQuantity.text.toString().toDoubleOrNull() ?: 0.0
            val cost = etCost.text.toString().toDoubleOrNull() ?: 0.0

            val dailyCost = quantity * cost
            val monthlyCost = dailyCost * 30

            txtResult.text =
                "🌾 Feed: $feedName\n\n" +
                        "💰 Daily Cost: ₹$dailyCost\n\n" +
                        "📅 Monthly Estimate: ₹$monthlyCost"
        }
    }
}