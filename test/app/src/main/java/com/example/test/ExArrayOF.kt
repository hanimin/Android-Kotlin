package com.example.test

val data1 = intArrayOf(10, 20, 30)
val data2 = booleanArrayOf(true, false, true)

fun main(){
    val data1 = arrayOf<Int>(10,20,30)
    println(
        """
           array size : ${data1.size}
           array data: ${data1[0]}, ${data1[1]}, ${data1[2]}
        """
    )
}