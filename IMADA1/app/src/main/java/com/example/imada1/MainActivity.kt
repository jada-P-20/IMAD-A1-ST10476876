package com.example.imada1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener
import androidx.core.view.WindowInsetsCompat
import java.util.Locale
import java.util.Locale.getDefault

fun getSocialSparkSuggestion(timeOfDay: String): String {
    return when (timeOfDay) {
        "morning" -> "Send a 'Good morning' text to a family member."
        "mid-morning" -> "Reach out to a colleague with a quick 'Thank you.'"
        "afternoon" -> "Share a funny meme or interesting link with a friend."
        "afternoon snack time" -> "Send a quick 'thinking of you' message."
        "dinner" -> "Call a friend or relative for a 5-minute catch-up."
        "after dinner", "night" -> "Leave a thoughtful comment on a friend's post."
        else -> "Please enter a valid time of day (e.g., morning, afternoon, dinner)."
    }
}

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val timeInput = findViewById<EditText>(R.id.timeInput)
        val suggestionText = findViewById<TextView>(R.id.suggestionText)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val enterButton = findViewById<Button>(R.id.enterbutton)

        resetButton.setOnClickListener {
            timeInput.text.clear()
            suggestionText.text = ""
        }

        enterButton.setOnClickListener {
            val timeDay = timeInput.text.toString().trim().lowercase()

            suggestionText.text = getSocialSparkSuggestion(timeOfDay = timeDay)

        }
        timeInput.setOnEditorActionListener { _, _, _ ->
            val timeDay = timeInput.text.toString().trim().lowercase()
            suggestionText.text = getSocialSparkSuggestion(timeOfDay = timeDay)
            true
        }

        // Function using a when statement


        setOnApplyWindowInsetsListener(
            findViewById(R.id.main),
            { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(
                    systemBars.left,
                    systemBars.top,
                    systemBars.right,
                    systemBars.bottom
                )
                insets
            }
        )

    }
}

