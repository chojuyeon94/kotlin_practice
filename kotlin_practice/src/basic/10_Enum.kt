package basic

// enum도 클래스이기때문에 생성자, 프로퍼티 정의 가능
enum class PaymentStatus(val label: String) : Payable {
    UNPAID(label = "미지급"){
        override fun isPayable(): Boolean = true
    },
    PAID(label = "지급완료"){
        override fun isPayable(): Boolean = false
    },
    FAILED(label = "지급실패"){
        override fun isPayable(): Boolean = false
    },
    REFUNDED(label = "환불"){
        override fun isPayable(): Boolean = false
    };

}

interface Payable {
    fun isPayable(): Boolean
}

fun main() {
//    println(PaymentStatus.REFUNDED.label)
//    if (PaymentStatus.UNPAID.isPayable()) {
//        println("결제 가능")
//    }

    val paymentStatus = PaymentStatus.valueOf("PAID")
    println(paymentStatus.label)

    if (paymentStatus == PaymentStatus.PAID) {
        println("결제 완료 상태")
    }

    // enum 클래스 기본 프로퍼티 2개 - name, ordinal
    for (status in PaymentStatus.values()) {
        println("[${status.name}](${status.label}) : ${status.ordinal}")
    }
}