package basic

open class Dog {
    open var age: Int = 0

    open fun bark() {
        println("bark")
    }
}

// 기본 생성자를 통해서 재정의 가능
// open상태가 되면 override 붙은 것들은 다 재정의 가능
// 재정의 불가능하게 하려면 final
open class BullDog(override var age : Int = 0): Dog() {

    override fun bark() {
        super.bark()
    }
}

abstract class Developer {

    abstract var age: Int
    abstract fun code(language: String)
}

class BackendDeveloper(override var age: Int): Developer() {
    override fun code(language: String) {
        println("Backend developer code: $language")
    }
}

fun main() {

    val backendDeveloper = BackendDeveloper(age = 20)
    println(backendDeveloper.age)
    backendDeveloper.code("kotlin")

//    val dog = BullDog(age = 2)
//    println(dog.age)
//    dog.bark()

}