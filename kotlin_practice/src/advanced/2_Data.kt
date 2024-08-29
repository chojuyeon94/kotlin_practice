package advanced

data class Person(val name: String, val age: Int)
// data class Person(var name: String, val age: Int)


fun main() {

    val person1 = Person("juyeon", 30)
    val person2 = Person("juyeon", 30)

    println(person1 == person2)
    println(person1.toString())
    val set = hashSetOf(person1)
    println(set.contains(person2))

//    preson1.name = "stranger"
//    print(set.contains(person1))

    val person3 = person1.copy(name = "stranger")
    println(person3)

    println("이름=${person1.component1()}, 나이=${person1.component2()}")

    // 구조 분해 할당
    val (name, age) = person1
    println(name)
    println(age)
}