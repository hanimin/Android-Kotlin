package com.example.test.va

//val data1:Int //오류 값대입
//val data2 = 10

fun someFun(){
    val data3:Int
    //println("data3: $data3") //초기값없음
    data3 = 10
    println("data3: $data3")
}

class Use{
    //val data4:Int //오류 선언후 값대입해야함
    val data5: Int = 10
}