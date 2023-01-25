package com.webflux.kotlin.demo.src.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("Carts")
data class Cart(
    @Id
    val id: Int,
    val cartItems: MutableList<CartItem> = mutableListOf()
)