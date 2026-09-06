package com.ampta.service;

import com.ampta.entity.Grocery;
import com.ampta.repository.GroceryRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GroceryService {
    private final GroceryRepo repo;
    public void addGrocery(Grocery grocery)
    {
        repo.save(grocery);
    }
}
