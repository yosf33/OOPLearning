import model.*

fun main(args: Array<String>) {
    val myPost=Post("youssef","educational")
    myPost.like()
    myPost.like()
    myPost.like()
    println(myPost.likeCount)

    val user=User("youssef",2002)
    println(user.age)
    val secondUser=User("Ahmed",1980)
    println(User.totalUserCount)
    //2-singleton
    Settings.language
    println(Settings.changeThemeToLight())

    val post = VideoPost("Barq","Q&A")
    post.like()
    post.like()
    post.like()
    println(post.likeCount)

    val myName:String="Youssef"
    myName.printTriple()
    val newPost = ImagePost("Ali", "fun")
    newPost.printImageLink()

    val postt=ImagePost("Ali", "fun")
    postt.editPost()

    println("-----------------------------------")
    var firstPost=Post("youssef","text")
    var secondPost = VideoPost("ali", "watch this")

    printPostDetails(firstPost)
    printPostDetails(secondPost)
    println("-----------------------------------")
    var listOfPosts = mutableListOf<BasePost>()
    listOfPosts.add(firstPost)
    listOfPosts.add(secondPost)
    for (post in listOfPosts) {
        printPostDetails(post)
    }
    println("-----------------------------------")

}

fun String.printTriple() {
    for (i in 1..3) {
        println("$this")

    }}
    fun ImagePost.printImageLink() {
        println(this.imageLink)
    }

fun printPostDetails(mPost: BasePost) {
    println(mPost.content)
}

fun printLink(mPost: BasePost) {
    when (mPost) {
        is ImagePost-> println(mPost.imageLink)
        is VideoPost-> println(mPost.videoLink360)
        is Post-> println("no link")
    }
}

