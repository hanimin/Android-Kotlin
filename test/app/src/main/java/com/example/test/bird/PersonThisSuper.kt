package com.example.test.bird
//this와 super를 사용하는 부 생성자
open class Person {
    constructor(firstName: String) {
        println("[Person] firstName: $firstName")
    }
    constructor(firstName: String, age: Int) { // ③
        println("[Person] firstName: $firstName, $age")
    }
}
class Developer: Person {
    constructor(firstName: String): this(firstName, 10) { // ①
        println("[Developer] $firstName")
    }
    constructor(firstName: String, age: Int): super(firstName, age) { // ②
        println("[Developer] $firstName, $age")
    }
}
fun main() {
    val miso = Developer("hani")
}