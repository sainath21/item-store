package com.target.itemstore.controller;

import com.target.itemstore.model.Item;
import com.target.itemstore.service.ItemStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item_store/v2")
public class ItemStoreController {

    @Autowired
    ItemStoreService itemStoreService;

    @GetMapping("/items/{item_id}")
    Item getItem(@PathVariable("item_id") Integer itemId) {
        return itemStoreService.getItem(itemId);
    }

    @PostMapping("/items")
    void postItem(@RequestBody Item item) {
        itemStoreService.saveItem(item);
    }
}
