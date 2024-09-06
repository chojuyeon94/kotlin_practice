package advanced

//import java.time.LocalDateTime
//
//object DateTimeUtils {
//    val now : LocalDateTime
//        get() = LocalDateTime.now()
//
//    const val DEFAULT_FORMAT = "yyyy-MM-DD"
//
//    fun same(a: LocalDateTime, b: LocalDateTime) : Boolean {
//        return a == b
//    }
//}
//
//fun main() {
//
//    println(DateTimeUtils.now)
//    println(DateTimeUtils.now)
//    println(DateTimeUtils.now)
//
//    println(DateTimeUtils.DEFAULT_FORMAT)
//
//    val now = LocalDateTime.now()
//    println(DateTimeUtils.same(now, now))
//
//
//}

class MyClass {

    private  constructor()

    //동반 객체에 이름 부여 가능(잘 안씀)
    companion object MyComapnion {
        val a = 1234

        fun newInstance() = MyClass()
    }
}

fun main() {

    println(MyClass.a)
    println(MyClass.newInstance())

    println(MyClass.MyComapnion.newInstance())
}