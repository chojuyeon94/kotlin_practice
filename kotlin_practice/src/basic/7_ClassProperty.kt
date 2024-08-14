package basic

// constructor 키워드는 생략 가능(굳이..? 어노테이션 같이 쓰는거아니면 굳이 안쓴다)
// 뒤에도 후행 콤마 가능 (코드 리뷰 등의 경우에 변동 사항을 1줄로 보기 위해)
class Coffee constructor(
    var name: String = "",
    var price: Double = 0.0,
    var iced: Boolean = false
) {
    val brand: String
        get() {
            return "스타벅스"
        }

    var quantity: Int = 0
        set(value) {
            if (value > 0) {
                // field라는 식별자를 사용해서 실제 필드의 참조에 접근
                // "backing field에 접근한다"는 표현을 사용
                field = value

                // 프로퍼티 값을 직접 할당하게 되면 quantity가 내부에서 set을 다시 호출하고..
                // 무한 재귀상태에 빠져서 stackoverflow
                // quantity = value
            }
        }
}

class EmptyClass

//
fun main() {
    val coffee = Coffee()
    coffee.name = "아이스 아메리카노"
    coffee.price = 2000.0
    coffee.quantity = 20
    coffee.iced = true

    if(coffee.iced){
        println("iced")
    }
    println("${coffee.name} ${coffee.price} ${coffee.quantity} ${coffee.brand}")
}