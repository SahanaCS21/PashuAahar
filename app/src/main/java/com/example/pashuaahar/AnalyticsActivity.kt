package com.example.pashuaahar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry

class AnalyticsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_analytics)

        val barChart = findViewById<BarChart>(R.id.barChart)

        // Example dynamic values
        val dailyCost = 120f
        val weeklyCost = dailyCost * 7
        val monthlyCost = dailyCost * 30
        val nutritionScore = 85f

        val entries = ArrayList<BarEntry>()

        entries.add(BarEntry(1f, dailyCost))
        entries.add(BarEntry(2f, weeklyCost))
        entries.add(BarEntry(3f, monthlyCost))
        entries.add(BarEntry(4f, nutritionScore))

        val barDataSet = BarDataSet(entries, "AI Feed Analytics")

        // Colors
        barDataSet.colors = listOf(
            android.graphics.Color.GREEN,
            android.graphics.Color.BLUE,
            android.graphics.Color.RED,
            android.graphics.Color.MAGENTA
        )

        barDataSet.valueTextSize = 16f

        val data = BarData(barDataSet)

        barChart.data = data

        // Labels
        val labels = ArrayList<String>()
        labels.add("")
        labels.add("Daily")
        labels.add("Weekly")
        labels.add("Monthly")
        labels.add("Nutrition")

        val xAxis = barChart.xAxis
        xAxis.valueFormatter =
            com.github.mikephil.charting.formatter.IndexAxisValueFormatter(labels)

        xAxis.position = XAxis.XAxisPosition.BOTTOM
        xAxis.granularity = 1f

        barChart.description.text = "AI Feed Cost Analytics Dashboard"

        barChart.animateY(1500)

        barChart.invalidate()
    }
}