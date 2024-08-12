package basic

// 외부에서 변수 선언 가능 (전역 변수)
var x = 3;

fun variable() {

    x += 1
    println(x)

    // 키워드, 변수명, 타입으로 선언
    val a : Int = 5

    // 코틀린 컴파일러가 타입을 추론해서 타입 생략이 가능은 하다
    val b = 1

    // 지연 할당 가능
    val c : Int
    c = 3

    // val(value) 불변 변수
    // var(variable) 가변 변수 - 타입은 고정

    var d : String = "Hello World"
    d = "Hi World"
}

