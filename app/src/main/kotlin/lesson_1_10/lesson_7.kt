package org.example.app.lessons_1_10

fun main() {
    val intRange1: IntRange = 42..443
    val intRange2: IntRange = 42 until 443
    val longRange: LongRange = 43L..433L
    val charRange: CharRange = 'a'..'z'
    val closedRangeDouble: ClosedRange<Double> = 42.0..433.0
    val closedRangeFloat: ClosedRange<Float> = 43f..433f
    val intProgression: IntProgression = 43..433 step 2
    val intProgression2: IntProgression = 433 downTo  43 step 2


    for (i in 5 downTo 1) {
        if (i == 3) {
//            println("Здесь печатается что то и цикл наччинается по новой!")
//            continue
//            println("Здесь цикл заканчивается!")
//            break
            println("Здесь программа заканчивается!")
            return

        }
        println("Ads will end for $i")
        Thread.sleep(1000)
    }

    println("Я вышел из цикла!")
}