package basic

fun main() {

//    for (i in 1..10) {
//        println(i)
//    }



//    until을 사용해 반복, 마지막 숫자는 포함 x
//    for (i in 0 until 10){
//        println(i)
//    }



// 간격은 step으로 조절
//    for(i in 10 downTo 0 step 2){
//        println(i)
//    }

// 전달받은 배열 반복
    val numbers = arrayOf(1,2,3,4,5)

    for (i in numbers) {
        println(i)
    }
}