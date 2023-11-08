package com.example.onlineShopOnKotlin.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Table
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import org.springframework.data.annotation.Id

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
data class User(
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Int,
    @Column
    val email:String,
    @Column
    val password:String,
)