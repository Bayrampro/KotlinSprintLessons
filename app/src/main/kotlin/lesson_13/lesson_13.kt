package lesson_13

fun main() {
    var nullableString: String? = readLine()
    var titleText: String = nullableString ?: "Here is nothing"
    println(titleText)


    nullableString = readLine()
    println(nullableString?.length)
    titleText = nullableString!!
    println(titleText)
}