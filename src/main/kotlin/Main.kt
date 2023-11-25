fun main() {
    println("Введите две различные цифры:")
    val number1 = readLine()?.toIntOrNull()
    val number2 = readLine()?.toIntOrNull()

    if (number1 != null && number2 != null && number1 != number2) {
        val result = createOddNumber(number1, number2)
        if (result != null) {
            println("Результат: $result")
        } else {
            println("Создать нечетное число невозможно")
        }
    } else {
        println("Пожалуйста, введите две различные цифры.")
    }
}

fun createOddNumber(num1: Int, num2: Int): Int? {
    return if ((num1 % 2 == 1 || num2 % 2 == 1) || (num1 % 2 == 0 && num2 % 2 == 0))
        num1 + num2
    else
        null
}