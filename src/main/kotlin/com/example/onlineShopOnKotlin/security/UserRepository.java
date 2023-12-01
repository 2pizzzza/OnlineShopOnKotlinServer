package com.example.onlineShopOnKotlin.security;

import com.example.onlineShopOnKotlin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends JpaRepository<User, Long> {
}
