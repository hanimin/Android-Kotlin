package com.example.test

//조건을 여러개 나열한 예
fun main(){
     var data = 10
    if(data > 10){
        println("data > 10")
    }else if (data > 0 && data <= 10){
        println("data > 0 && dara <=10")
    }else{
        println("data <= 0")
    }
}