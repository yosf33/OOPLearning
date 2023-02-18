package model

abstract class BasePost(val userName: String, val content: String) {
    var likeCount: Int = 0

    fun like() {
        likeCount++
    }
    abstract fun editPost()

}