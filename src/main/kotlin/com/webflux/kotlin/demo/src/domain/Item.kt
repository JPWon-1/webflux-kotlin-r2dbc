package com.webflux.kotlin.demo.src.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("Items")
data class Item(
    @Id
    var id: Int,
    var name: String,
    var price: Double
)
