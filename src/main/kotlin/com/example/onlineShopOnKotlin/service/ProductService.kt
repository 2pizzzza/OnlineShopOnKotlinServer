package com.example.onlineShopOnKotlin.service

import com.example.onlineShopOnKotlin.entity.Product
import java.util.Optional

interface ProductService {
    fun createProduct(product: Product):Product

    fun getAllProduct():List<Product>

    fun getProductById(id:Long): Optional<Product>
}