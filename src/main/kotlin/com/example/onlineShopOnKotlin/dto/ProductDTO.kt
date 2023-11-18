package com.example.onlineShopOnKotlin.dto

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.*
import lombok.experimental.FieldDefaults

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
class ProductDTO (

    @Id val id:Long,

    val name:String,

    val price:Int,

    val desc:String,

    val text:String,

    val image:String
) {
}