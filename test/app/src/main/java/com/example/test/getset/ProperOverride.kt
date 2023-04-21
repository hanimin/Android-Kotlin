package com.example.test.getset

open class First {
    open val x: Int = 0
        get() {
            println("First x")
            return field
        }
    val y: Int = 0
}
class Second : First(){
    override  val x: Int = 0
    get(){
        println("Second x")
        return field +3
    }
    //override cal y : Int = 0 에러 open 키워드가 없어 오버라이딩 불가
}
fun main(){
    val second =Second()
    println(second.x)
    println(second.y)
}