package com.target.itemstore.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "item_information", schema = "store")
public class ItemCoreInformation {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "item_id")
    Integer itemId;

    @Column(name = "item_title")
    String itemTitle;

    String description;

    Integer qty;
}
