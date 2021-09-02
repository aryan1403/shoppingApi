package com.shoppingapp.shoppingapi.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@Document
public class Item {
    public String id;
    public String itemname;
    public String itemdesc;
    public double price;
    public String imageurl;
}
