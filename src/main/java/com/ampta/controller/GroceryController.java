package com.ampta.controller;

import com.ampta.entity.Grocery;
import com.ampta.service.GroceryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grocery")
@AllArgsConstructor
public class GroceryController {
    private final GroceryService groceryService;

    public void addGrocery(@RequestBody Grocery grocery)
    {
        groceryService.addGrocery(grocery);
    }
}
