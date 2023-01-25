package com.webflux.kotlin.demo.src.controller

import com.webflux.kotlin.demo.src.domain.Item
import com.webflux.kotlin.demo.src.repository.ItemRepository
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import reactor.core.publisher.Flux

@Controller
class HomeController(
    private val itemRepository: ItemRepository
) {
    @GetMapping("/")
    @ResponseBody
    fun home(): String{
        val items: Flux<Item> = itemRepository.findAll()
        items.map { v-> println(v.name) }
        return "home";
    }
}