package ru.netology

fun main() {

    val result = calc(1000.00, 10500.00, "meloman")
    println("сумма к оплате: $result")
}

fun calc(totalProd: Double, historyProd: Double, status: String = "normal"): Double {
    var totalCalc = 0.00
    when {
        historyProd >= 1001.00 && historyProd < 10000.00 -> totalCalc = totalProd - 100.00
        historyProd >= 10001.00 -> totalCalc = totalProd / 1.05
        historyProd < 1000.00 -> totalCalc = totalProd
    }
    when (status){
        "meloman" -> totalCalc /= 1.05
    }
    return totalCalc
}






