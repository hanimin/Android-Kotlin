package com.example.test.bird

//생성시 필요한 기본값을 지정할 수 있다.
class Bird10(var name: String ="NONAME", var wing: Int = 2, var beak: String, var color: String) {
    //프로퍼티 위에 var val로 선언

    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol : $vol")
}
fun main() {
    val coco = Bird10(beak = "long", color = "red")
    println("coco.name: ${coco.name}, coco.wing: ${coco.wing}")
    println("coco.color: ${coco.color}, coco.beak: ${coco.beak}")
    coco.fly()
}