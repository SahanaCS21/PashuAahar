package com.example.pashuaahar

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FeedResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed_result)

        // Back Button

        val backButton = findViewById<TextView>(R.id.btnBack)

        backButton.setOnClickListener {
            finish()
        }

        // Result Text

        val resultText = findViewById<TextView>(R.id.tvResult)

        val recommendation =
            intent.getStringExtra("recommendation") ?: "No Recommendation"

        val cost =
            intent.getStringExtra("cost") ?: "₹0/day"

        val finalResult = """

$recommendation

💰 Estimated Cost: $cost

✅ AI-Based Smart Recommendation Generated

        """.trimIndent()

        resultText.text = finalResult
    }
}