package basic

fun main(){

    // if else 사용
    val job = "Developer"
    if(job == "Developer"){
        println("개발자")
    }
    else{
        println("개발자 아님")
    }


    // kotlin의 if else는 표현식
    val age : Int = 10
    val str = if (age > 20) {
        "성인"
    }
    else {
        "아이"
    }


    // kotlin은 삼항 연산자가 없음
    val a = 1
    val b = 2
    val c = if (b > a) b else a
}