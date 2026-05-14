package com.example.pashuaahar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class CowProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cow_profile)

        val breedInput = findViewById<EditText>(R.id.etBreed)
        val ageInput = findViewById<EditText>(R.id.etAge)
        val weightInput = findViewById<EditText>(R.id.etWeight)
        val milkYieldInput = findViewById<EditText>(R.id.etMilkYield)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {

            val breed = breedInput.text.toString()

            val age = ageInput.text.toString().toIntOrNull() ?: 0

            val weight = weightInput.text.toString().toIntOrNull() ?: 0

            val milk = milkYieldInput.text.toString().toIntOrNull() ?: 0

            val recommendation: String

            val cost: String

            if (milk >= 15 && weight >= 400) {

                recommendation = """
🔴 High Nutrition Feed

🌾 3kg Maize
🌱 2kg Cottonseed Cake
🧂 Mineral Mix
🍀 Premium Green Fodder
💧 Extra Clean Water

📊 Protein: High
⚡ Energy: High
🌿 Fiber: Balanced
                """.trimIndent()

                cost = "₹350/day"

            } else if (milk >= 8 && weight >= 250) {

                recommendation = """
🟠 Medium Nutrition Feed

🌾 2kg Maize
🌱 1kg Cottonseed Cake
🍀 Dry Fodder
💧 Fresh Water

📊 Protein: Medium
⚡ Energy: Medium
🌿 Fiber: Balanced
                """.trimIndent()

                cost = "₹220/day"

            } else {

                recommendation = """
🟢 Low Nutrition Feed

🌾 1kg Maize
🍀 Green Grass
💧 Plenty of Water

📊 Protein: Basic
⚡ Energy: Low
🌿 Fiber: Moderate
                """.trimIndent()

                cost = "₹120/day"
            }

            val intent = Intent(this, FeedResultActivity::class.java)

            intent.putExtra("recommendation", recommendation)

            intent.putExtra("cost", cost)

            intent.putExtra("breed", breed)

            intent.putExtra("age", age)

            intent.putExtra("weight", weight)

            intent.putExtra("milk", milk)

            startActivity(intent)
        }
    }
}