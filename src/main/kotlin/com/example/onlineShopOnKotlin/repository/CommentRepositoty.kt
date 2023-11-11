package com.example.onlineShopOnKotlin.repository

import com.example.onlineShopOnKotlin.entity.Comment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CommentRepositoty: JpaRepository<Comment, Long> {
}