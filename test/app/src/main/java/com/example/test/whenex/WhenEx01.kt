package com.example.test.whenex

/*
키보드로 문자를 입력받아
부장 600
차장 500
대리 300
사원 200

성적프로그램 만들기
키보드로 값을 입력받아 abcdef등급
 */

/*fun main(){
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when(score) {
        in 90.0..100.0 -> grade ='A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade ='C'
        in 60.0..69.9 ->grade ='D'
        in 50.0..59.9 -> grade='E'
        !in 50.0..100.0 ->grade='F'
    }
    println("Score: $score, Grade: $grade")
}*/

fun main(){
    print("직급을 입력하세요 ")
    val rank = readLine()!!.toString()
    var pay: Int = 200

    when(rank) {
      "부장" -> pay = 600
      "차장" -> pay = 500
      "과장" -> pay = 400
      "대리" -> pay = 300
      "사원" -> pay = 200
    }
    println("직급: $rank, 월급: $pay")
}