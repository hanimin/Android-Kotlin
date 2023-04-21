package com.example.test.whenex

//when 문의 조건으로 정수가 아닌 다른 타입의 데이터르 지정할 수도 있습니다.
fun main(){
    var data ="hello"
    when (data){
        "hello" -> println("data is hello")
        "world" -> println("data is world")
        else -> {
            println("data is not valid data")
        }
    }
}