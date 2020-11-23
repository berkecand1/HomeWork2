package com.example.personinformationsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        personInfo()
    }

    private fun personInfo() {
        val car = Person(name = "Berke",surname = "Dinçer",age = 22, homeTown = "Ankara",Jobs = "Engineer")
        car.muchEarn(Times = 11)
        car.warning()

        val peoplee = Woman(name = "ayşe",surname = "fatma",age = 30,homeTown = "Antalya")
        peoplee.warning()

        val peopple = Man(name = "Ben", surname = "Sen",age = 45, homeTown = "Adana")
        peopple.warning()


    }
}