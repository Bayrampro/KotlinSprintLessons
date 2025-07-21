package lesson_19

enum class Status(val id: Int) {
    NEW(101) {
        override fun getStatusDesc() : String {
            return "Заказ обработан"
        }
    },
    COOKING(102) {
        override fun getStatusDesc() : String {
            return "Готовится..."
        }
    },
    COMPLETED(103) {
        override fun getStatusDesc() : String {
            return "Готово!"
        }
    },
    ERROR (0) {
        override fun getStatusDesc() : String {
            return "Упс что-то пошло не так!"
        }
    };

    abstract fun getStatusDesc() : String

}