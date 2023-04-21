package com.example.test.bird
// 클래스명과 함께 생성자 정의 - 프로퍼티가 포함된 주 생성자
class Bird7(var name: String, var wing: Int, var beak: String, var color: String) {
    //프로퍼티 위에 var val로 선언

    //메서드
    fun fly() = println("Fly wing $wing")
    fun sing(vol: Int) = println("Sing vol : $vol")
}
fun main(){
    val coco = Bird7("bird", 11, "long", "orange")
    println("coco.name: ${coco.name}, coco.wing: ${coco.wing}")
    println("coco.color: ${coco.color}, coco.beak: ${coco.beak}")
}