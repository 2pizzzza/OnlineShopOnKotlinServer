package com.example.onlineShopOnKotlin.dto

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class CommentDTO(
    val id:Long,

    val text:String,
)