package com.example.personinformationsystem

import android.util.Log

open class Person (val name: String, val surname: String, val age: Int, val homeTown: String){

    var Jobs: String = ""

    constructor(name: String, surname: String, age: Int, homeTown: String, Jobs: String):this(name, surname, age, homeTown){
        this.Jobs = Jobs

    }
    init {
        Log.i(TAG, "Hello my name is $name $surname. I'm $age years old. I am from $homeTown")
    }
    fun muchEarn(Times: Int){
        val salaryAccount: SalaryAccount = SalaryAccount()
        val salary = salaryAccount.getSalary(Jobs, Times)
        if (salary < 3000){
            Log.i(TAG, "muchEarn: Sorry $salary is not possible.")
        }
        else if (salary in 3001..5499){
            Log.i(TAG,"muchEarn: You get an average salary. You can make a living with a $salary salary.")
            Log.i(TAG,"muchEarn: Your profession: $Jobs. you work $Times hours in total. Your salary $salary  ")
            Log.i(TAG, "muchEarn Your Salary is ${muchDollar(salary)} $")
        }
        else{
            Log.i(TAG,"muchEarn: You get an high salary. You can get whatever you want. You can make a living with a $salary salary.")
            Log.i(TAG,"muchEarn: Your profession: $Jobs. you work $Times hours in total. Your salary $salary  ")
            Log.i(TAG, "muchEarn Your Salary is ${muchDollar(salary)} $")
        }

    }

    private fun muchDollar(Dollar: Int):Double{
        val dollars = Dollar.toDouble()
        val ExchangeRate = 7.64.toDouble()
        val totalDollars = dollars/ExchangeRate
        return totalDollars

    }
    open fun warning(){
        Log.i(TAG,"You should consume at least 2.5 liters of water a day to work more efficiently. Important to your health")
    }

    companion object{
        const val TAG = "Person"
    }

}