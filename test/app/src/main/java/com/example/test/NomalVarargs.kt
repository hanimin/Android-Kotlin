package com.example.test

//가변적인 매개변수 받기

fun print3Numbers(num1: Int, num2: Int, num3: Int){
}
fun print4Numbers(num1: Int, num2: Int, num3: Int, num4: Int){
}
fun main(args: Array<String>){
    nomalVarargs(1, 2, 3, 4)
    nomalVarargs(4, 5, 6)
}

fun nomalVarargs(vararg counts: Int){
    for (num in counts){
        println("$num")
    }
    print("\n")
}