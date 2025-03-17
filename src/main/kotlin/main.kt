package ru.netology

fun main() {
    val amount = 494876
    val minComission = 35
    val comissionRatio = 0.75

    var comission = (amount * comissionRatio) / 100
    if (comission < minComission) {
        comission = minComission.toDouble()
    }
    println("Размер комиссии: ${comission.toInt()} руб.")
}