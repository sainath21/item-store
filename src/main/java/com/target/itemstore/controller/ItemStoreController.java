package com.target.itemstore.controller;

import com.target.itemstore.model.Item;
import com.target.itemstore.model.MultiItems;
import com.target.itemstore.service.ItemStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/item_store/v2")
public class ItemStoreController {

    @Autowired
    ItemStoreService itemStoreService;

    @GetMapping("/items/{item_id}")
    Item getItem(@PathVariable("item_id") Integer itemId) {
        return itemStoreService.getItem(itemId);
    }

    @GetMapping("/items")
    MultiItems getItem(
        @RequestParam(value = "title", required = false) String title,
        @RequestParam(value = "qty", required = false) Integer qty
    ) {
        List<Item> itemList = null;
        if(title != null) {
            itemList = itemStoreService.getItem(title);
        } else if(qty != null) {
            itemList =  itemStoreService.getItemByQty(qty);
        } else {
            itemList = new ArrayList<>();
        }

        /*Map<String, List<Item>> resultMap = new HashMap<>();
        resultMap.put("items", itemList);
        return resultMap;*/
        MultiItems multiItems = new MultiItems();
        multiItems.setItems(itemList);
        return multiItems;
    }

    @PostMapping("/items")
    void postItem(@RequestBody Item item) {
        itemStoreService.saveItem(item);
    }
}
