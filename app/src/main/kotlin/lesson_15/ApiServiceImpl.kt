package lesson_15

class ApiServiceImpl : ApiServiceInterface {
    override fun getUserList(): List<String> {
        return listOf<String>("Bayram", "Kesha", "Nedir")
    }

    override fun sendUserInfo(id: Int) {
        println("User info sent to server")
    }

    override fun deleteUser(id: Int) {
        println("User deleted")
    }
}