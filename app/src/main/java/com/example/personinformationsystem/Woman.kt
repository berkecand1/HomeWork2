package com.example.personinformationsystem

import android.util.Log

class Woman( name: String,  surname: String,  age: Int,  homeTown: String): Person(name, surname, age, homeTown) {
    override fun warning() {
        if (age < 30)
            Log.i(TAG, "Research shows that woman younger than 30 need 3 to 3.5 liters of water.")
        else
            Log.i(TAG, "It is recommended that woman over 30 years old should not exceed 3 liters.")
    }
    companion object{
        const val  TAG = "Woman"
    }
}