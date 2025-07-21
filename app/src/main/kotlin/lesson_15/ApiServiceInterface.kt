package lesson_15

interface ApiServiceInterface {
    fun getUserList() : List<String>
    fun sendUserInfo(id: Int)
    fun deleteUser(id: Int)
}