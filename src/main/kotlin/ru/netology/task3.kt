package ru.netology

fun main() {

    val resultToDouble = calc(1000.00, 10500.00, "meloman")
    val result = String.format("%.2f", resultToDouble)
    println("сумма к оплате: $result руб")
}

fun calc(totalProd: Double, historyProd: Double, status: String = "normal"): Double {
    var totalCalc = 0.00
    when { // '* 100' -переводим в копейки
        historyProd * 100 >= 1001.00 && historyProd * 100 < 10000.00 -> totalCalc = totalProd * 100 - 100.00
        historyProd * 100 >= 10001.00 -> totalCalc = totalProd * 100 / 1.05
        historyProd * 100 < 1000.00 -> totalCalc = totalProd * 100
    }
    if (status == "meloman") {
        totalCalc /= 1.05
    } else {
        totalCalc
    }
    return totalCalc / 100  // переводим обратно в руб

}






