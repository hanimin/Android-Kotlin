package com.example.test.forex

//컬렉션 타입의 데이터 개수만큼 반복
//indices는 컬렉션 타입의 인덱스 값을 의미
//인데스와 실제 데이터를 함께 가져오려면 withindex()함수를 이용

//반족 저건에 컬렉션 타입활용
fun main(){
    var data = arrayOf<Int>(10,20,30)
    for(i in data.indices){
        print(data[i])
        if(i !== data.size -1) print(",")
    }
}

//인데스와 데이터를 가져오는 withIndex()함수
/*
fun main() {
    var data = arrayOf<Int>(10,20,30)
    for ((index, value) in data.withIndex()){
        print(value)
        if (index !== data.size - 1 )print(",")
    }
}*/
