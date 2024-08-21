package basic

class Product(val name: String, val price: Int)


// 인터페이스는 또 다른 상위 인터페이스를 가질 수 있음
interface Wheel {
    fun roll()
}

interface Cart : Wheel {

    var coin: Int

    // 인터페이스에서는 backing field 접근 불가, 이렇게 특정 값을 만들어주는 경우에만 사용 가능
    val weight: String
        get() = "20KG"

    fun add(product: Product)

    fun rent() {
        if (coin > 0) println("카트를 대여합니다.")
    }

    override fun roll() {
        println("카트가 굴러갑니다.")
    }

    fun printId() = println("1234")
}

// 복수개의 인터페이스 구현 가능
interface Order {
    fun add(product: Product) {
        println("${product.name} 주문이 완료되었습니다.")
    }

    // 두 개의 인터페이스에서 동일한 시그니처의 디폴트 함수를 제공하고 있으므로 코틀린 컴파일러 오류 발생
    fun printId() = println("5678")
}

class MyCart(override var coin: Int) : Cart, Order {
    override fun add(product: Product) {
        if (coin <= 0) println("코인을 넣어주세요.")
        else println("${product.name}이(가) 카트에 추가됐습니다.")

        // super로 상위클래스에 접근하려면 <상위클래스>를 붙여서 접근해야한다.
        super<Order>.add(product)
    }

    // 디폴트 함수가 이렇게 겹치면 하위클래스에서 재정의해서 사용해야한다.
    override fun printId() {
        super<Cart>.printId()
        super<Order>.printId()
    }
}

fun main() {
    val cart = MyCart(coin = 100)
    cart.rent()
    cart.roll()
    cart.add(Product(name = "장난감", price = 100))
    cart.printId()
}