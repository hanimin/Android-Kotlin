package com.example.test.over

//일반 함수에서의 오버로딩
fun add(x: Int, y: Int): Int { // 정수 자료형 매개변수 2개를 더함
    return x + y
}
fun add(x: Double, y: Double): Double { // 실수 자료형 매개변수 2개를 더함
    return x + y
}
fun add(x: Int, y: Int, z: Int): Int { // 정수 자료형 매개변수 3개를 더함
    return x + y + z
}

//클래스 메서드의 오버로딩
fun main() {
    val calc = Calc()
    println(calc.add(3,2))
    println(calc.add(3.2, 1.3))
    println(calc.add(3, 3, 2))
    println(calc.add("Hello", "World"))
}
class Calc {
    // 다양한 매개변수로 오버로딩된 메서드들
    fun add(x: Int, y: Int): Int = x + y
    fun add(x: Double, y: Double): Double = x + y
    fun add(x: Int, y: Int, z: Int): Int = x + y + z
    fun add(x: String, y: String): String = x + y
}
