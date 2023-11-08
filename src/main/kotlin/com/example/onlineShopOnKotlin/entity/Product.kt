package com.example.onlineShopOnKotlin.entity

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
data class Product (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long,

    @Column
    val dasc:String,

    @Column
    val text:String,

    @Column
    val price:Int,

    @Column
    val image:String
)