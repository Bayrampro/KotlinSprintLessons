package org.example.app.lessons_1_10

fun main() {
    // у массива фиксированный размер/длина
    // Array<T>, List<T>
    // Массивы оптимизированы для примитивов
    // Отличается процесс сравнение элементов


    val list: List<Int> = listOf(1, 2, 4, 5)
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    println(mutableList)

    mutableList.add(42)
    println("42 added to end $mutableList")

    mutableList.add(0, 42)
    println("42 added to start $mutableList")

    val isThisNumberContains = mutableList.contains(42)
    when(isThisNumberContains) {
        true -> println("Is this list contains 42? Answer is yes")
        false -> println("Is this list contains 42? Answer is no")
    }

    when(mutableList.isEmpty()) {
        true -> println("Is this list empty? Answer is yes")
        false -> println("Is this list empty? Answer is no")
    }

    println("First index of 42 is: ${mutableList.indexOf(42)}")
    println("Last index of 42 is: ${mutableList.lastIndexOf(42)}")

    mutableList.sort()
    println("List is sorted: $mutableList")

    mutableList.sortDescending()
    println("List is sorted descending: $mutableList")

    // mutableList.forEach((int number) {
    //    ...
    // });
    // in Dart
    mutableList.forEach { number: Int ->
        println(number)
    }

    // mutableList.where((element) => element == 42); in Dart
    val filteredList = mutableList.filter { element: Int ->
        element == 42
    }

    filteredList.forEach { number: Int ->
        println(number)
    }

    // mutableList.map((element) => number * 5); in Dart
    val newList = mutableList.map { number: Int ->
        number * 5
    }

    newList.forEach { number: Int ->
        println(number)
    }
}