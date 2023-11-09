package com.example.onlineShopOnKotlin.entity

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
enum class Role (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long,
    @Column(nullable = false, unique = true)
    val nameRole:String,
    @ManyToMany(mappedBy = "roles")
    val users:ArrayList<User>
){


}