package basic

// 기본 함수 선언 스타일, 몸통이 있으면 반환타입 생략 불가(컴파일 오류)
fun sum(a:Int, b:Int) : Int {
    return a + b
}

// 표현식 스타일
fun sum2(a:Int, b:Int) : Int = a + b

// 표현식 스타일 + 반환타입 생략
fun sum3(a:Int, b:Int) = a + b

// 반환타입이 없으면 Unit이라는 타입 반환
fun printSum(a:Int, b:Int) : Unit {
    println("sum of $a and $b is ${a + b}")
}

// 디폴트 파라미터
fun greeting(message: String = "Hi"){
    println(message)
}

/*
fun main(){
    greeting()
    greeting("Hello")
}

 */

// named argument
fun log(level:String = "INFO", message: String){
    println("[$level] $message")
}

fun main() {
    log(message = "인포 로그")
    log(level = "DEBUG", message = "디버그 로그")
    log("DEBUG", "디버그 로그")
    log(level = "WARN", "워닝 로그")
}



