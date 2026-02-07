package com.example.itemmanagement.controller;

import com.example.itemmanagement.model.Item;
import com.example.itemmanagement.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
@CrossOrigin("*")
public class ItemController {

    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @PostMapping
    public Item addItem(@Valid @RequestBody Item item) {
        return service.add(item);
    }

    @GetMapping("/{id}")
    public Item getItem(@PathVariable int id) {
        return service.getById(id);
    }
}
