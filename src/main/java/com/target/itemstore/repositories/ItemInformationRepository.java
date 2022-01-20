package com.target.itemstore.repositories;

import com.target.itemstore.model.ItemCoreInformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemInformationRepository extends CrudRepository<ItemCoreInformation, Integer> {
    ItemCoreInformation findByItemTitle(String itemTitle);
}
