package com.example.test

//표현식으로 사용 예
fun main(){
    var data = 10
    val result = if (data > 0){
        println("data > 0")
        true // 참일 때 반환 값
    }else{
        println("data <= 0")
        false //거짓일 때 반환 값
    }
    println(result)
}