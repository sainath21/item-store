package com.target.itemstore.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    @JsonProperty("item_id")
    private Integer itemId;

    private Integer qty;
    private String title;
    String description;
    Double price;

    @JsonProperty("vendor_name")
    String vendorName;
}
