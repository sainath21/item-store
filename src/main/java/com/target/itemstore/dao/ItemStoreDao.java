package com.target.itemstore.dao;

import com.target.itemstore.model.ItemCoreInformation;

import java.util.List;

public interface ItemStoreDao {
    ItemCoreInformation getItemCoreInformation(Integer itemId);

    void saveItemCoreInformation(ItemCoreInformation item);

    ItemCoreInformation getItemCoreInformation(String itemTitle);

    List<ItemCoreInformation> getItemCoreInformationByQty(Integer qty);

}
