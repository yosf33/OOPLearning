package model

import interfacee.EditablePost

class VideoPost (userName:String,content:String) : BasePost(userName, content) ,EditablePost{
    var videoLink360:String=""
    override fun editPost() {
        println("enter vide post")
    }

    override fun edit() {
        TODO("Not yet implemented")
    }
}