package com.example.test.getset

//커스텀 게터와 세터의 사용
class User2(_id: Int, _name: String, _age:Int){
    val id: Int = _id
    var name: String = _name
        set(value){
            println("The name was changed")
            field =value.toUpperCase() //받은 인자를 대문자롤 변경해 프로퍼티에 할당
        }
    var age: Int = _age
}
fun main(){
    val user1 =User(1,"kildong", 35)
    user1.name = "coco"// 여기서 사용자 고유의 출력 코드가 실행된다.
    println("user3.name = ${user1.name}")
}
