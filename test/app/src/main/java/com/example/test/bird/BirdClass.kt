package com.example.test.bird

//클래스명과 함께 생성자 정의 - constructor 키워드 생략

// 주 생성자 선언
class Bird2 (_name: String, _wing: Int, _beak: String, _color: String) {
    //프로퍼티
    var name: String = _name
    var wing: Int = _wing
    var beak: String = _beak
    var color: String = _color

    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol : $vol")
}