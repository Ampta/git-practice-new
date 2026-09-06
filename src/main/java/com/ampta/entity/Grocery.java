package com.ampta.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grocery {
    @Id
    private Long id;

    private String groceryName;
    private Integer groceryQuantity;
    private String grocerysize;

}
