package com.example.onlineShopOnKotlin.dto

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class ProductDTO (

    val id:Long,

    val name:String,

    val price:Int,

    val desc:String,

    val text:String,

    val image:String
)