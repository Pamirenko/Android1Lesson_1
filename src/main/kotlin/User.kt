data class User(
    val userName: String,
    val email: String,
    val age: Int,
    val password: String
) : Verifiable {
    override fun verify(user: User) {
        if (this.userName == user.userName &&
            this.email == user.email &&
            this.age == user.age &&
            this.password == user.password
        ) {
            println("Вход выполнен успешно!")
        } else {
            throw IllegalArgumentException("Неверные данные для входа")
        }
    }
}