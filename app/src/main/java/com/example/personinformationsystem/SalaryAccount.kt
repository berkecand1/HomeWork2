package com.example.personinformationsystem

const val INVALID_ARG = -1

class SalaryAccount {

    val hood : Array<String> = arrayOf("Cook", "Engineer", "Teacher", "Doctor")
    val times : Array<Int> = arrayOf(8,9,10,11)

    val salaryMatrix = arrayListOf(
        arrayOf( 3000 , 4000 , 3000 , 7000),
        arrayOf( 3250 , 4500 , 3500 , 8000),
        arrayOf( 3750 , 5055 , 4500 , 8800),
        arrayOf( 4750 , 7500 , 5000 , 9500)

    )

    fun getSalary(job: String, workHour: Int): Int{
        return if (workHour in times && job in hood )
                    salaryMatrix[times.indexOf(workHour)][hood.indexOf(job)]
               else
                    INVALID_ARG
    }
}

