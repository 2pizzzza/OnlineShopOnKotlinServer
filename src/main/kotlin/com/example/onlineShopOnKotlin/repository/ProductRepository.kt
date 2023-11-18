package com.example.onlineShopOnKotlin.repository

import com.example.onlineShopOnKotlin.entity.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository :JpaRepository<Product, Long> {
}