package basic

fun main(){

    Thread.sleep(1) // try, catch 필수 아님

    try {
        Thread.sleep(1)
    } catch (e : Exception){
        println("에러 발생")
    }

    // Java의 try, catch는 구문이라 값 반환 불가
    // Kotlin은 표현식이라 값 반환 가능

    try {
        throw Exception()
    } catch (e : Exception){
        println("에러 발생")
    } finally {
        println("finally 실행")
    }

    val a = try{
        "1234".toInt()
    } catch (e : Exception){
        println("예외 발생")
    }
    println(a)

//    throw Exception("예외 발생")

//    val b: String? = "not null"
    val b: String? = null
    val c: String = b ?: failFast("a is null")

    println(c.length)
//    failFast("예외 예외")

    println("이 메시지는 출력될까?")

}

// Nothing타입: 코드 안정성을 보장하지 않음
fun failFast(message: String): Nothing {
    throw IllegalArgumentException(message)
}