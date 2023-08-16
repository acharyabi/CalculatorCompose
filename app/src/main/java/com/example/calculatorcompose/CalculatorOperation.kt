package com.example.calculatorcompose

sealed class CalculatorOperation(val symbol: String){
    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("+")
    object Divide: CalculatorOperation("/")
    object Muntiply: CalculatorOperation("*")

}
