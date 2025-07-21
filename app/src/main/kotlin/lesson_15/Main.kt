package lesson_15

fun main() {
    val apiService: ApiServiceInterface = ApiServiceImpl()

    println(apiService.getUserList())
    apiService.sendUserInfo(id = 4)
    apiService.deleteUser(id = 4)
}