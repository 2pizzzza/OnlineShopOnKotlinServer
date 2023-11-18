package com.example.onlineShopOnKotlin.service

import com.example.onlineShopOnKotlin.entity.Comment
import com.example.onlineShopOnKotlin.entity.Product
import java.util.*

interface CommentService {
    fun createComment(comment: Comment): Comment

    fun getAllComment():List<Comment>

    fun getCommentById(id:Long): Optional<Comment>
}