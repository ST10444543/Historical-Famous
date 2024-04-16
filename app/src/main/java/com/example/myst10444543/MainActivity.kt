package com.example.myst10444543

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var personDatabase = PersonDatabase()
        var nameEditText = findViewById<EditText>(R.id.name)
        var ageEditText = findViewById<EditText>(R.id.age)
        var searchButton = findViewById<Button>(R.id.searchbutton)
        var clearButton = findViewById<Button>(R.id.clear)
        var resultTextView = findViewById<TextView>(R.id.result)

        searchButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val age = ageEditText.text.toString().toIntOrNull()
            if (age != null) {
                val result = personDatabase.searchByNameAndAge(name, age)
            }
            else if (age == 20) {
                resultTextView.text = "The is no Historical famous at this age"
            }
            else {
                resultTextView.text = "Please enter a valid age."
            }
            clearButton.setOnClickListener {
                nameEditText.text.clear()
                ageEditText.text.clear()
                resultTextView.text = ""
            }
            personDatabase.addPerson("Stive biko", 31)
            personDatabase.addPerson("Albert Einstein", 76)
            personDatabase.addPerson("Leonardo da Vinci", 67)
            personDatabase.addPerson("Winston Churchill", 90)
            personDatabase.addPerson("Marie Curie", 66)
            personDatabase.addPerson("Mahatma Gandhi", 78)
            personDatabase.addPerson("William Shakespeare", 52)
            personDatabase.addPerson("Martin Luther King Jr", 39)
            personDatabase.addPerson("Nelson Mandela", 95)
            personDatabase.addPerson("Chris Hani", 50)
        }
    }
}
