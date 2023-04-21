package com.example.test.va

//lateinit var data1: Int //오류  초기값할당안함
//lateinit val dato2: String //오류 val키워드 =>var키워드로 선언
lateinit var data3: String

val data4: Int by lazy {
    println("in lazy.....") //첫번째 행에만 사용
    10
}

fun main(){
    println("in main.....")
    println(data4+10)
    println(data4+10)
}