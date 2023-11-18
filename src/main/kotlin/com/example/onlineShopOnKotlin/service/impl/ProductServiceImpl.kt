package com.example.onlineShopOnKotlin.service.impl

import com.example.onlineShopOnKotlin.entity.Product
import com.example.onlineShopOnKotlin.repository.ProductRepository
import com.example.onlineShopOnKotlin.service.ProductService
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl :ProductService {

     private val productRepository: ProductRepository = TODO()


    override fun createProduct(product: Product): Product {
        return productRepository.save(product)
    }

    override fun getAllProduct(): List<Product> {
        return productRepository.findAll()
    }

    override fun getProductById(id: Long): Optional<Product> {
        return productRepository.findById(id)
    }
}