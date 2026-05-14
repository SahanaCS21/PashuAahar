package com.example.pashuaahar

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class VeterinaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Connect Veterinary Dashboard Layout
        setContentView(R.layout.activity_veterinary)

        // Card Click Animation
        val animation =
            AnimationUtils.loadAnimation(this, R.anim.card_click)

        // =========================
        // Daily Health Tips
        // =========================

        val dailyHealthCard =
            findViewById<LinearLayout>(R.id.dailyHealthCard)

        dailyHealthCard.setOnClickListener {

            dailyHealthCard.startAnimation(animation)

            startActivity(
                Intent(
                    this,
                    DailyHealthActivity::class.java
                )
            )
        }

        // =========================
        // Vaccination Reminder
        // =========================

        val vaccinationCard =
            findViewById<LinearLayout>(R.id.vaccinationCard)

        vaccinationCard.setOnClickListener {

            vaccinationCard.startAnimation(animation)

            startActivity(
                Intent(
                    this,
                    VaccinationActivity::class.java
                )
            )
        }

        // =========================
        // Nutrition Advice
        // =========================

        val nutritionCard =
            findViewById<LinearLayout>(R.id.nutritionCard)

        nutritionCard.setOnClickListener {

            nutritionCard.startAnimation(animation)

            startActivity(
                Intent(
                    this,
                    NutritionAdviceActivity::class.java
                )
            )
        }

        // =========================
        // Emergency Symptoms
        // =========================

        val emergencyCard =
            findViewById<LinearLayout>(R.id.emergencyCard)

        emergencyCard.setOnClickListener {

            emergencyCard.startAnimation(animation)

            startActivity(
                Intent(
                    this,
                    EmergencySymptomsActivity::class.java
                )
            )
        }
    }
}