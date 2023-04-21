package com.example.test
//리스트 사용 예
fun main(){
    var list = listOf<Int>(10,20,30)
    println(
        """
           list size :  ${list.size}
           list data :  ${list[0]}, ${list.get(1)}, ${list.get(2)}
        """
    )
}