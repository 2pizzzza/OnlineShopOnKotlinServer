package com.example.onlineShopOnKotlin.controler

import com.example.onlineShopOnKotlin.entity.Product
import com.example.onlineShopOnKotlin.service.ProductService
import lombok.RequiredArgsConstructor
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
@RequiredArgsConstructor
class ProductController {
    private final val productService: ProductService = TODO()

    @GetMapping("allproduct/")
    fun getAllProduct(): List<Product> {
        return productService.getAllProduct()
    }

    @GetMapping("getById/{id}")
    fun getById(id: Long): ResponseEntity<Product> {
        val product = productService.getProductById(id)
        return product.map { ResponseEntity.ok(it) }.orElse(ResponseEntity.noContent().build())
    }
}