package com.example.itemmanagement.service;

import com.example.itemmanagement.model.Item;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ItemService {

    private List<Item> items = new ArrayList<>();

    public Item add(Item item) {
        for (Item i : items) {
            if (i.getId().equals(item.getId())) {
                throw new IllegalArgumentException("Item with this ID already exists");
            }
        }
        items.add(item);
        return item;
    }

    public Item getById(int id) {
        return items.stream()
                .filter(i -> i.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
