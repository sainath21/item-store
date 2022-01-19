package com.target.itemstore.dao;

import com.target.itemstore.model.ItemCoreInformation;

public interface ItemStoreDao {
    ItemCoreInformation getItemCoreInformation(Integer itemId);

    void saveItemCoreInformation(ItemCoreInformation item);
}
