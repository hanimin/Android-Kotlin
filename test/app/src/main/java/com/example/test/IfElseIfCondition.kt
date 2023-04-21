package com.example.test

fun main(){
    print("Enter the score: ")
    val score = readLine()!!.toDouble() //콘솔로 부터 입력 받음
    var grade: Char ='F'

    if (score >=90.0){
        grade ='A'
    }else if(score >= 80.0 && score <= 89.9){
        grade ='B'
    }else if(score >=70.0 && score <79.9){
        grade = 'C'
    }
    println("Score: $score, Grade: $grade")
}

/* 범위 연산자 이용 예
if(score >=90){
    grade='A'
    }
    else if(score in 80.0..89.9{
    grade='B'
    }
    else if(score in 70.0..79.9{
    grade='C'
    }

 */