package lesson_19

fun main() {
    val statusFromServer: List<Int> = listOf<Int>(101, 102, 103)

    for (i in statusFromServer) {
        when(i) {
            Status.NEW.id -> setStatus(Status.NEW.getStatusDesc())
            Status.COOKING.id -> setStatus(Status.COOKING.getStatusDesc())
            Status.COMPLETED.id -> setStatus(Status.COMPLETED.getStatusDesc())
            else -> setStatus(Status.ERROR.getStatusDesc())
        }
    }
}


private fun setStatus(text: String) {
    println(text)
}


