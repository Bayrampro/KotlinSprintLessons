package org.example.app.lessons_1_10

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   var numberOfOrders: Int = 42

   val welcomeMessage: String = "Hello bro";

   println("$welcomeMessage $numberOfOrders")

   // целочисленные
   val intNum1: Int = 2122234443 // 10 значное число максимум
   val intNum2: Int = -2122234443 // 10 значное число максимум
   val longNum: Long // 64 bit
   val shortNum: Short // 16 bit
   val byteNum: Byte // 8 bit

   // вещественные
   val doubleNum: Double = 34.5 // 64 bit
   val floatNum: Float = 67.4f // 32 bit

   // строковые
   val stringValue: String = "Hello"
   val charValue: Char = '1'
}
