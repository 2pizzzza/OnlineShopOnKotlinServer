package com.example.onlineShopOnKotlin.repository

import com.example.onlineShopOnKotlin.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository :JpaRepository<Product, Long> {
    fun findByTitle(name:String): Product
}