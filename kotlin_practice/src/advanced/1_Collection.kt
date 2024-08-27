package advanced

import java.util.LinkedList

fun main() {

    // immutable
    val currencyList = listOf("달러", "유로", "원")

//     mutable
//    val mutableCurrencyList = mutableListOf<String>()
//    mutableCurrencyList.add("달러")
//    mutableCurrencyList.add("유로")
//    mutableCurrencyList.add("원")

    // apply를 사용하여 간단히 작성 가능
    // this 참조가 숨어있음
    val mutableCurrencyList = mutableListOf<String>().apply{
        add("달러")
        add("유로")
        this.add("원")
    }

    // immutable set
    val numberSet = setOf(1, 2, 3, 4, 5)

    // mutable set
    val mutableNumberSet = mutableSetOf<Int>().apply{
        add(1)
        add(2)
        add(3)
        add(4)
        add(5)
    }

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2, "three" to 3)

    // mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1
    mutableNumberMap["two"] = 2
    mutableNumberMap["three"] = 3

    // 컬렉션 빌더
    // 빌더 안에서는 mutable처럼 값을 마음대로 넣을 수 있지만, 외부에서는 immutable처럼 불가능
    // 내부에선 mutable, 반환은 immutable
    val numberList: List<Int> = buildList {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    // linkedList
    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }

    // arrayList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = currencyList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    println("====================")

    for (currency in currencyList) {
        println(currency)
    }

    println("====================")

    currencyList.forEach { println(it) }

    println("====================")

    // for loop => map
    val lowerList = listOf("a", "b", "c")
//    val upperList = mutableListOf<String>()
//
//    for (lowerCase in lowerList) {
//        upperList.add(lowerCase.uppercase())
//    }

    val upperList = lowerList.map { it.uppercase() }
    println(upperList)

    println("====================")

//    val filteredList = mutableListOf<String>()
//    for (upperCase in upperList) {
//        if (upperCase == "A" || upperCase == "C") {
//            filteredList.add(upperCase)
//        }
//    }
    val filteredList = upperList.filter { it == "A" || it == "C" }
    println(filteredList)





}