package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor @Data
public class Category {
    private int id; // Унікальний ідентифікатор категорії
    private String name; // Назва категорії

}