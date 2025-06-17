package com.pluarlsight.NorthwindTradersSpringBoot.repositories;

import com.pluarlsight.NorthwindTradersSpringBoot.models.Product;

import java.util.List;

public interface ProductDao {
    void add(Product product);

    List<Product> getAll();
}
