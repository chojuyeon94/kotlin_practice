package advanced

import advanced.OtherDeveloper.name

sealed class Developer {
    abstract val name: String
    abstract fun code(language: String)
}

data class BackendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("Backend developer code: $language")
    }
}

data class FrontendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("Frontend developer code: $language")
    }
}
data class AndroidDeveloper(override val name: String) : Developer(){
    override fun code(language: String) {
        println("I'm android developer")
    }
}

object OtherDeveloper : Developer() {
    override val name: String = "익명"
    override fun code(language: String) {

    }
}

object DeveloperPool {
    var pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when(developer) {
        is advanced.BackendDeveloper -> pool[developer.name] = developer
        is advanced.FrontendDeveloper -> pool[developer.name] = developer
        else -> println("지원하지 않는 개발자입니다.")
//        else -> {
//            println("지원하지 않는 개발자입니다.")
//        }
    }

    fun get(name: String) = pool[name]
}

fun main() {
    val backendDeveloper = advanced.BackendDeveloper(name="토니")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = advanced.FrontendDeveloper(name="카즈야")
    DeveloperPool.add(frontendDeveloper)

    val androidDeveloper = AndroidDeveloper(name="안드")
    DeveloperPool.add(androidDeveloper)

    println(DeveloperPool.get("토니"))
    println(DeveloperPool.get("카즈야"))
    println(DeveloperPool.get("안드"))
}