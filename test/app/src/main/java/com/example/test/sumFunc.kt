package com.example.test

fun sum(a: Int, b: Int): Int {
    var sum = a+b
    return sum
}

fun main(){
    val result1 =sum(3,2)
    val result2 =sum(6,7)

    println(result1)
    println(result2)
}

//Unit 형
fun printSum(a: Int, b: Int): Unit{
    println("sum of $a and $b id ${a+b}")
}

//fun printSum(a: Int, b: Int){
  //  println("sum of $a and $b id ${a+b}")