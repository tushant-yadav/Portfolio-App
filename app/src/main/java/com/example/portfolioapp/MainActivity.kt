package com.example.portfolioapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonSkills = findViewById<Button>(R.id.btnSkills)
        buttonSkills.setOnClickListener {
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        val buttonEdu = findViewById<Button>(R.id.btnEdu)
        buttonEdu.setOnClickListener {
            intent = Intent(this, Edu::class.java)
            startActivity(intent)
        }
        val buttonWork = findViewById<Button>(R.id.btnWork)
        buttonWork.setOnClickListener {
            intent = Intent(this, Work::class.java)
            startActivity(intent)
        }
        val buttonAchievements = findViewById<Button>(R.id.btnAchievements)
        buttonAchievements.setOnClickListener {
            intent = Intent(this, Achievements::class.java)
            startActivity(intent)
        }
    }
}