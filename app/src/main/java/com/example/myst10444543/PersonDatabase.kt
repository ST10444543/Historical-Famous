package com.example.myst10444543

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class PersonDatabase {
    data class Person(val name: String, val age: Int)

    private val persons = mutableListOf<Person>()

    fun addPerson(name: String, age: Int) {
        persons.add(Person(name, age))

    }
    fun searchByNameAndAge(name: String, age: Int): String {
        val result = persons.firstOrNull { it.name == name && it.age == age }
        return result?.let { "Found: ${it.name}, Age: ${it.age}" } ?: "Person not found."
    }
}