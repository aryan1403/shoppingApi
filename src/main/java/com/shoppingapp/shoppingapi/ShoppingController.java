package com.shoppingapp.shoppingapi;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import com.shoppingapp.shoppingapi.Entity.Item;
import com.shoppingapp.shoppingapi.Entity.ShoppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/shoppingapi")
public class ShoppingController {
    @Autowired
    ShoppingRepository repository;

    @PostMapping("/add") 
    public String addItem(@RequestBody Item item){
        repository.insert(item);
        return "Added Data in Stock Succesfully";
    }

    @GetMapping("/get") 
    public List<Item> getData() {
        return repository.findAll();
    }
}
