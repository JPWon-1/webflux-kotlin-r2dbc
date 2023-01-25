package com.webflux.kotlin.demo.src.domain


data class CartItem(
    val item: Item,
    var quantity: Int = 1
) {
    fun increment() {
        quantity++
    }
}