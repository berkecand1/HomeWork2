package com.example.personinformationsystem

import android.util.Log

class Man( name: String,  surname: String,  age: Int,  homeTown: String): Person(name, surname, age, homeTown) {

    override fun warning() {
        if (age < 30)
            Log.i(TAG, "Research shows that men younger than 30 need 3 to 3.5 liters of water.")
        else
            Log.i(TAG, "It is recommended that men over 30 years old should not exceed 3 liters.")
    }
    companion object{
        const val  TAG = "Man"
    }

    fun a(name: String,age: Int){
        for (i in 0..age) {
            Log.i(TAG, "Hello  $name.")
        }
    }
    fun a(surname: String){
        Log.i(TAG, "My name is $surname.")
    }
}
