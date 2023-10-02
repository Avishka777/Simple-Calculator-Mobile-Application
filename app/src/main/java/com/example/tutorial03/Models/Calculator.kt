package com.example.tutorial03.Models

class Calculator (private val number1:Double, private val number2:Double) {

    fun add():Double{
        return number1+number2
    }

    fun subtract():Double{
        return number1-number2
    }

    fun multiply():Double{
        return number1*number2
    }

    fun divide():Double{
        return number1/number2
    }

}