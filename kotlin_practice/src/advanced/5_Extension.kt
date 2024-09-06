package advanced

fun String.first(): Char {
    return this[0]
}

fun String.addFirst(char: Char): String {
    return char + this
}

//확장 함수 작성 시에 동일한 시그니처의 함수나 변수가 있으면 멤버쪽 클래스가 직접 보유하고 있는 쪽이 우선
class MyExample {
    fun printMessage() = println("클래스 출력")
}

fun MyExample.printMessage(message: String) = println(message)

fun MyExample?.printNullOrNotNull() {
    if (this == null) println("null")
    else println("not null")
}

fun main() {
//    MyExample().printMessage("확장 출력")

    var myExample: MyExample? = null
    myExample.printNullOrNotNull()

    myExample = MyExample()
    myExample.printNullOrNotNull()

    println("ABCD".first())
    println("ABCD".addFirst('Z'))
}