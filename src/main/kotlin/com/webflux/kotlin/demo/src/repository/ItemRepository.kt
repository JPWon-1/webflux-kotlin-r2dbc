package com.webflux.kotlin.demo.src.repository

import com.webflux.kotlin.demo.src.domain.Item
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface ItemRepository : ReactiveCrudRepository<Item, Int> {
}