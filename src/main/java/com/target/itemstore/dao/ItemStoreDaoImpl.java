package com.target.itemstore.dao;

import com.target.itemstore.model.ItemCoreInformation;
import org.springframework.stereotype.Component;

@Component
public class ItemStoreDaoImpl implements ItemStoreDao {
    @Override
    public ItemCoreInformation getItemCoreInformation(Integer itemId) {
        ItemCoreInformation itemCoreInformation = new ItemCoreInformation();
        itemCoreInformation.setItemId(itemId);
        return itemCoreInformation;
    }

    @Override
    public void saveItemCoreInformation(ItemCoreInformation itemCoreInformation) {
        System.out.println("save item: " + itemCoreInformation);
    }


}
