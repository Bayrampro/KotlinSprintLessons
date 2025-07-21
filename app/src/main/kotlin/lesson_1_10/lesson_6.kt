package org.example.app.lessons_1_10

fun main() {
    var counter = 5

//    while (counter > 0) {
//        println("Ads will end for ${counter--}")
//        Thread.sleep(1000)
//    }

    do {
        println("Ads will end for ${counter--}")
        Thread.sleep(1000)
    } while (counter > 0)
}