package com.mcgeecahill.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("item-catalog")
interface ItemClient {

    @GetMapping("/items")
    Resources<Item> readItems();
}