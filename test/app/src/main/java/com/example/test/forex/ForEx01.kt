package com.example.test.forex

//1~10 까지의 짝수 출력
//1~10까지의 홀수 출력
//1~10까지의 짝수 누적합계
//1~10까지의 홀수 누적합계
//1~10 10을 제외한 숫자를 내림차순 출력

fun main(){
    for (i in 2..10 step 2){
        print("$i\t")
    }
    println()
    for (i in 1..10 step 2){
        print("$i\t")
    }
    println()


    var sum2:Int = 0
    for (i in 1..10 step 2) {
        sum2 += i
    }
    print("1~10 홀수 합 : $sum2")
    println()

    var sum1:Int = 0
    for (i in 2..10 step 2) {
        sum1 += i
    }
    print("1~10 짝수 합 : $sum1")
    println()

    for (i in 9 downTo 1){
        print("$i\t")
    }
    println()

    for (i in 9 downTo 1 step 2){
        print("$i\t")
    }
    println()

    for (i in 1..10){
        if(i%2==0){
            print("$i\t")
        }
    }

    for (i in 1..10){
        if(i%2==1){
            print("$i\t")
        }
    }
}
