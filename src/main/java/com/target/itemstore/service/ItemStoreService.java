package com.target.itemstore.service;

import com.target.itemstore.dao.ItemStoreDao;
import com.target.itemstore.model.Item;
import com.target.itemstore.model.ItemCoreInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemStoreService {
    @Autowired
    ItemStoreDao itemStoreDao;

    public Item getItem(Integer itemId) {
        ItemCoreInformation itemCoreInformation = itemStoreDao.getItemCoreInformation(itemId);
        Item item = new Item();
        item.setItemId(itemCoreInformation.getItemId());
        item.setDescription(itemCoreInformation.getDescription());
        item.setTitle(itemCoreInformation.getItemTitle());
        item.setQty(itemCoreInformation.getQty());
        return item;
    }

    public List<Item> getItem(String itemTitle) {
        ItemCoreInformation itemCoreInformation = itemStoreDao.getItemCoreInformation(itemTitle);
        Item item = new Item();
        item.setItemId(itemCoreInformation.getItemId());
        item.setDescription(itemCoreInformation.getDescription());
        item.setTitle(itemCoreInformation.getItemTitle());
        item.setQty(itemCoreInformation.getQty());

        List<Item> items = new ArrayList<>();
        items.add(item);

        return items;
    }

    public List<Item> getItemByQty(Integer qty) {
        List<ItemCoreInformation> itemCoreInformationList = itemStoreDao.getItemCoreInformationByQty(qty);
        List<Item> items = new ArrayList<>();

        for(ItemCoreInformation itemCoreInformation : itemCoreInformationList) {
            Item item = new Item();
            item.setItemId(itemCoreInformation.getItemId());
            item.setDescription(itemCoreInformation.getDescription());
            item.setTitle(itemCoreInformation.getItemTitle());
            item.setQty(itemCoreInformation.getQty());
            items.add(item);
        }
        return items;
    }

    public void saveItem(Item item) {
        ItemCoreInformation itemCoreInformation = new ItemCoreInformation();
        itemCoreInformation.setItemId(item.getItemId());
        itemCoreInformation.setItemTitle(item.getTitle());
        itemCoreInformation.setDescription(item.getDescription());
        itemCoreInformation.setQty(item.getQty());

        itemStoreDao.saveItemCoreInformation(itemCoreInformation);
        System.out.println("item saved successfully");
    }
}
