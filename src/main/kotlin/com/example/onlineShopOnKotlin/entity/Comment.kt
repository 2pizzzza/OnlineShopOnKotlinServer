package com.example.onlineShopOnKotlin.entity

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Comment(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long,

    @ManyToMany(fetch = FetchType.LAZY)
    val products: List<Product> = mutableListOf(),


    @ManyToMany(fetch = FetchType.LAZY)
    val users: List<User> = mutableListOf(),

    @Column(columnDefinition = "VARCHAR(255) DEFAULT 'amit'")
    val text:String
)