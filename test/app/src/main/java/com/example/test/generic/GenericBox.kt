package com.example.test.generic

//간단한 제네릭의 예
class Box<T>(t: T) { // 제네릭을 사용해 형식 매개변수를 받아 name에 저장
    var name = t
}
fun main() {
    val box1: Box<Int> = Box<Int>(1)
    val box2: Box<String> = Box<String>("Hello")

    //자료형이 추론 가능한 경우 앵글 브라켓 표현 생략
    val box3 = Box(2) // 1은 Int형이므로 Box<Int>로 유추함
    val box4 = Box("Bye") // "Hello"은 String형이므로 Box<String>로 유추함

    println(box1.name)
    println(box2.name)
    println(box3.name)
    println(box4.name)
}