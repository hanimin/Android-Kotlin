package com.example.test

//when 문 사용 예
fun main(){
    var data = 10
    when (data){
        10 -> println("data is 10")
        20 -> println("data is 20")
        else -> {
            println("data is not valid data")
        }
    }
}