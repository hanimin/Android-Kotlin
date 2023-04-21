package com.example.test.Limit

fun <T: Number> addLimit(a: T, b: T, op: (T, T) -> T): T {
    return op(a, b)
}
fun main() {
    //val result = addLimit("abc", "def", {a, b -> a + b}) // 제한된 자료형으로 인해 오류 발생!
    val result = addLimit(2, 3, {a, b -> a + b})
// val result = add(2, 3) {a, b -> a + b}와 같이 표현 가능
    println(result)
}
