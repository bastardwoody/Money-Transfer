const val CENT = 100.00
const val MINIMUM = 35.00
const val PERCENT = 0.75

fun main() {
    print("Введите сумму перевода: ")
    val amount = readLine()?.toLong() ?: return
    if (amount * PERCENT / 100 <= MINIMUM) {
        print("Перевод на сумму $amount выполнен. Комиссия составила: ${(MINIMUM * CENT).toInt()} коп.")
    } else {
        print("Перевод на сумму $amount выполнен. Комиссия составила: ${((amount * CENT) * PERCENT / 100).toInt()} коп.")
    }
}