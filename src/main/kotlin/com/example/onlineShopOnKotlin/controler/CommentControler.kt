package com.example.onlineShopOnKotlin.controler

import com.example.onlineShopOnKotlin.entity.Comment
import com.example.onlineShopOnKotlin.service.CommentService
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequiredArgsConstructor
class CommentControler {

    val commentService:CommentService = TODO()

    @GetMapping("/comment/all")
    fun getAllComment():List<Comment>{
        println("amit")
    return commentService.getAllComment()
    }
    @PostMapping("comment/")
    fun createComment(@RequestBody comment: Comment): Comment {
        return commentService.createComment(comment)
     } 
}
