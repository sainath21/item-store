package com.target.itemstore.dao;

import com.target.itemstore.model.ItemCoreInformation;
import com.target.itemstore.repositories.ItemInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemStoreDaoImpl implements ItemStoreDao {
    @Autowired
    ItemInformationRepository itemInformationRepository;

    @Override
    public ItemCoreInformation getItemCoreInformation(Integer itemId) {
        return itemInformationRepository.findById(itemId).orElse(null);
    }

    @Override
    public ItemCoreInformation getItemCoreInformation(String itemTitle) {
        return itemInformationRepository.findByItemTitle(itemTitle);
    }

    public List<ItemCoreInformation> getItemCoreInformationByQty(Integer qty) {
        return itemInformationRepository.findByQty(qty);
    }

    @Override
    public void saveItemCoreInformation(ItemCoreInformation itemCoreInformation) {
        System.out.println("save item: " + itemCoreInformation);
    }
}
