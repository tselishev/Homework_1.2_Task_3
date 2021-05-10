package ru.netology


fun main() {

    val price = 100 // цена
    val discount = 100 // начальная скидка
    val discount5 = 1.05 // 5% скидка
    val startDiscount = 1000 // начальная сумма покупок для скидки
    val otherDiscount = 10000 // сумма покупок для скидки 5%
    val count = 101 // количество покупок

    val totalPrice = price * count

    val result = when {
        (totalPrice >= startDiscount) && (totalPrice < otherDiscount) -> totalPrice - discount
        totalPrice > otherDiscount -> totalPrice / discount5
        else -> totalPrice
    }

    println(
        "Заказ на сумму от 1000-10000 руб. - скидка $discount" + " руб.," +
                " от 10001 руб. и выше - скадка 5%.\nВаш заказ на сумму: $totalPrice" + " руб." +
                "\nИтоговая цена, к оплате: $result" + " руб."
    )

}