package com.example.onlineShopOnKotlin.dto

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.NonNull
import lombok.Setter

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class UserDTO(
    val id:Long,

    @NonNull
    val name:String,

    @NonNull
    val email:String,

    @NonNull
    val password:String

)