package com.example.pashuaahar

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Animation
        val animation = AnimationUtils.loadAnimation(this, R.anim.card_click)

        // Cow Profile Card
        val cowProfile = findViewById<LinearLayout>(R.id.btnCowProfile)

        cowProfile.setOnClickListener {

            cowProfile.startAnimation(animation)

            val intent = Intent(this, CowProfileActivity::class.java)
            startActivity(intent)
        }

        // Veterinary Tips Card
        val veterinaryCard = findViewById<LinearLayout>(R.id.veterinaryCard)

        veterinaryCard.setOnClickListener {

            veterinaryCard.startAnimation(animation)

            val intent = Intent(this, VeterinaryActivity::class.java)
            startActivity(intent)
        }

        // Cost Tracker Card
        val costCard = findViewById<LinearLayout>(R.id.costCard)

        costCard.setOnClickListener {

            costCard.startAnimation(animation)

            startActivity(Intent(this, CostTrackerActivity::class.java))
        }

        // Feed Calculator Card
        val feedCard = findViewById<LinearLayout>(R.id.feedCard)

        feedCard.setOnClickListener {

            feedCard.startAnimation(animation)

            val intent = Intent(this, CowProfileActivity::class.java)
            startActivity(intent)
        }

    }
}