package com.webflux.kotlin.demo.src.service

import com.webflux.kotlin.demo.src.domain.Item
import com.webflux.kotlin.demo.src.repository.ItemRepository
import org.springframework.stereotype.Service

@Service
class ItemService(
    val itemRepository: ItemRepository
) {
    fun save(){
        val item = Item(1,"new item",10000.0);
        itemRepository.save(item)
    }
}