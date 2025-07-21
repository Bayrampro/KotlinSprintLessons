package lesson_20

import java.util.Calendar

fun main() {

    // анонимные функции
    val calendar: Calendar = Calendar.getInstance()
    val getDaysToEndYear: () -> Int = fun(): Int = 365 - calendar[Calendar.DAY_OF_YEAR]
    println(getDaysToEndYear())
    val convertEndDaysToMills: (endDays: Int) -> Unit = fun(endDays: Int) = println(1000 * 60 * 60 * 24 * endDays)
    convertEndDaysToMills(getDaysToEndYear())

    // lambda
    val stringWithLambda: (value: Int) -> String
    stringWithLambda = { value: Int ->
        "Hello i am lambda with value: $value"
    }
    stringWithLambda(444);
    { value: String -> println("Hello kotlin: $value") }(stringWithLambda(444))

}