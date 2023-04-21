package com.example.test.whenex

//when은 if 문과 마찬가지로 표현식으로도 사용할 수 있습니다.
fun main(){
    var data =10
    val result = when{
        data <= 0 ->"data is <= 0"
        data > 100 -> "data is > 100"
        else -> "data is valid"
    }
    println(result)
}