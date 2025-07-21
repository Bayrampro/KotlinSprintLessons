package lesson_22

fun main() {

    // data class vs claas
    // equals - в дата классе сравнивает поля а в обычном классе сравнивает ссылку на объект в памяти
    // hashCode - одинаковый для дата классов, разные для обычных классов
    // toString - выдает понятную строку для дата класса, а для обычного класса дает дефолтный
    // copy - копирует существуещий объект, можно изменить поля перед копированием

    val word1 = Word(word = "Hello", translate = "Salam")
    println(word1.toString())

    val word2 = Word(word = "You", translate = "Sen")
    val word3 = Word(word = "Hello", translate = "Salam")
    println(word1 == word2)
    println(word1 == word3)

    println(word1.hashCode())
    println(word3.hashCode())

    val word4 = word1.copy(word = "Best")
    println(word4.toString())
}