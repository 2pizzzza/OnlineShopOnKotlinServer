package com.example.onlineShopOnKotlin.entity

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import org.springframework.data.annotation.Id

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
data class User(
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Int,
    @Column
    val email:String,
    @Column
    val password:String,

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
        name = "roles_users",
    )
    val roles:ArrayList<Role>
)