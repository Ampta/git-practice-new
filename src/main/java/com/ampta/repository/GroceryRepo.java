package com.ampta.repository;

import com.ampta.entity.Grocery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryRepo extends JpaRepository<Grocery, Long> {
}
