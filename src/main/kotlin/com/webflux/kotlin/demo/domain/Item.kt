package com.webflux.kotlin.demo.domain

import org.springframework.data.annotation.Id


class Item(
    @Id
    val id: String,
    val name: String,
    val price: Double
) {

}
