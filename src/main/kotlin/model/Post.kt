package model

import interfacee.EditablePost

open class Post(userName:String,content:String):BasePost(userName, content),EditablePost {
    override fun editPost() {
        println("enter text here")
    }

    override fun edit() {
        TODO("Not yet implemented")
    }

}