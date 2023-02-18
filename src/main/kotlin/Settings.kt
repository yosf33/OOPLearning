import model.User

object Settings {
    var language: String = "Arabic"
    var theme: String = "Dark"
    fun logout(user: User) {
        println("user${user.userName}logout")
    }

    fun changeThemeToLight() {
        theme = "lLight"
    }
}