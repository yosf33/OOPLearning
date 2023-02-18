package model

import interfacee.EditablePost

class ImagePost(userName:String,content:String) : BasePost(userName, content),EditablePost {
    var imageLink: String = ""

    override fun editPost() {
        println("enter image post")
    }

    override fun edit() {
        TODO("Not yet implemented")
    }
}