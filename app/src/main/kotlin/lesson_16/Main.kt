package lesson_16

fun main() {
    // private - Данные будут видны в рамках одного класса или одного файла (если он определен глобально)
    // public - Видны из любой части проекта
    // protected - Данные будут видны в рамках одного класса и его наследниках
    // internal - Доступны в любой части модуля

    val someClass: SomeClass = SomeClass()

    println(someClass.getState())

    someClass.onStart()
    someClass.onLoad()
    someClass.onFail()

    println(someClass.getState())
}