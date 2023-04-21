package com.example.test.realtionship

class Car(val neme: String, val power: String){
    private var engine = Engine(power)
    fun startEngine() =engine.start()
    fun stopEngine() = engine.stop()
}
class Engine(power: String){
    fun start() = println("Engine has been starteed.")
    fun stop() = println("Engine has been stopped.")
}
fun main(){
    val car = Car("tico", "100hp")
    car.startEngine()
    car.stopEngine()
}