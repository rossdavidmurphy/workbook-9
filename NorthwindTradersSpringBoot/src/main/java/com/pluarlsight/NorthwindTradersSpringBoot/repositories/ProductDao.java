package com.pluarlsight.NorthwindTradersSpringBoot.repositories;

import com.pluarlsight.NorthwindTradersSpringBoot.models.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getAll();

    Product add(Product product);
}
