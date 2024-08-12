package basic

fun main(){

    val day = 2

    when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        else -> "기타"
    }

    // else는 생략 가능(다른 요소가 없다면)
    when(getColor()) {
        Color.RED -> print("Red")
        Color.YELLOW -> print("Yellow")
        //else -> print("What?")
    }

    // 여러개 조건을 콤마로 구분하여 한줄 정의
    when (getNumber()) {
        0, 1 -> print("0 or 1")
        else -> print("What?")
    }

}

enum class Color {
    RED, YELLOW
//, ORANGE, MAGENTA, PURPLE
}

fun getColor() = Color.RED
fun getNumber() = 2