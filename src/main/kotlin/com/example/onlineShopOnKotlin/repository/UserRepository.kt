package com.example.onlineShopOnKotlin.repository

import com.example.onlineShopOnKotlin.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface UserRepository: JpaRepository<User, Long> {
    fun findByEmail(email:String):User
    fun findByName(name:String): Optional<User>
}