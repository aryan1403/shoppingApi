package com.shoppingapp.shoppingapi.Entity;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShoppingRepository extends MongoRepository<Item, String> {

}
