package com.target.itemstore.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ItemCoreInformation {
    Integer itemId;

    String itemTitle;

    String description;

    Integer qty;
}
