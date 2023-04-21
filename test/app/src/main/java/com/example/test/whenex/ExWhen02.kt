package com.example.test

//인자를 사용하는 when문
fun main() {
    var x = 3
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x는 1, 2가 아닙니다.")
        }
    }

    //인자를 사용하는 when문 (Cont.)
    //일치되는 여러조건
    when(x){
        0, 1 ->print("x == 0 or x == 1")
        else ->print("기타")
    }

    //함수의 반환값 사용하기
    /*when(x){
        parseInt(s)->print("일치함")
        else -> print("기타")
    }*/

    //in 연산자와 범위 지정자 사용
    when(x){
        in 1..0 -> print("x는 1이상 10이하 입니다.")
        !in 10..20 -> print("x는 10이상 20이하의 범위에 포함되지 않습니다.")
        else -> print("x는 어떤 범위에도 없습니다.")
    }

    //is키워드 함께 사용하기
    /*val str = "안녕하세요."
    val result = when(str){
        is String -> "문자열입니다."
        else ->false
    }*/
}