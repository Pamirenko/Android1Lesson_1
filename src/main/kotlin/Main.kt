import java.util.*

fun main(args: Array<String>) {

    val predefinedUser = User("Angelika", "larltr17@gmail.com", 16, "дыкындыщ")
    println("Предопределенный пользователь: $predefinedUser")
    val scanner = Scanner(System.`in`)
    print("Введите имя пользователя: ")
    val inputUsername = scanner.nextLine()
    print("Введите email: ")
    val inputEmail = scanner.nextLine()
    print("Введите возраст: ")
    val inputAge = scanner.nextInt()
    print("Введите пароль: ")
    val inputPassword = scanner.next()
    val userInput = User(inputUsername, inputEmail, inputAge, inputPassword)
    println("Пользователь с введенными данными: $userInput")
    try {
        predefinedUser.verify(userInput)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}