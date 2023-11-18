package com.example.onlineShopOnKotlin.service.impl

import com.example.onlineShopOnKotlin.entity.Comment
import com.example.onlineShopOnKotlin.entity.Product
import com.example.onlineShopOnKotlin.repository.CommentRepositoty
import com.example.onlineShopOnKotlin.service.CommentService
import java.util.*

class CommentServiceIImpl: CommentService {

    val commentRepositoty:CommentRepositoty = TODO()
    override fun createComment(comment: Comment): Comment {
        return commentRepositoty.save(comment)
    }

    override fun getAllComment(): List<Comment> {
        return commentRepositoty.findAll()
    }

    override fun getCommentById(id: Long): Optional<Comment> {
        return commentRepositoty.findById(id)
    }

}