package com.target.itemstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item_store/v1")
public class ItemStoreController {
    @GetMapping("/items")
    String getItems() {
        return "Hello Item";
    }
}
