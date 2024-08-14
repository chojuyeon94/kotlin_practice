package basic

fun getNullStr(): String? = null

fun getLengIfNotNullStr(str: String?) = str?.length ?: 0

fun main(){

//    null 컴파일 오류
//    val a : String = null
//    var b : String = "aabbcc"
//    b = null

//    안전 연산자(?) null이 가능
//    var a : String? = null
//    println(a?.length)
//
//    var b : Int = if (a != null) a.length else 0
//    println(b)
//
//    // 엘비스 연산자
//    val c = a?.length ?: 0
//    println(c)

//

    val nullableStr = getNullStr()
    val nullableStrLength = nullableStr?.length ?: "null일 경우 반환".length
    println(nullableStrLength)

    val length = getLengIfNotNullStr(null)
    println(length)

    // throw NullPointerException()
    // Kotlin에서는 NPE 가능성이 낮아지는 것이다. 아예 발생하지 않는 것이 아니다.


//    val c: String? = null
//    val d = c!!.length // 단언 연산자 - 컴파일러에게 개발자가 체크하겠다고 선언

//    NPE 발생
//    println(Java_NullSafety.getNullStr().length)
    println(Java_NullSafety.getNullStr()?.length ?: 0)

}