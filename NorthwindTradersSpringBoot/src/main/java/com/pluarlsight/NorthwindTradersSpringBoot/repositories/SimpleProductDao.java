package com.pluarlsight.NorthwindTradersSpringBoot.repositories;

import com.pluarlsight.NorthwindTradersSpringBoot.models.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao {

    private List<Product> products = new ArrayList<>();
    private int lastProductId = 5;

    public SimpleProductDao() {
        products.add(new Product(1, "Coffee", "Beverage", 6.99));
        products.add(new Product(2, "Tea", "Beverage", 4.49));
        products.add(new Product(3, "Smoothie", "Beverage", 7.79));
        products.add(new Product(4, "Bagel", "Food", 2.89));
        products.add(new Product(5, "Breakfast Burrito", "Food", 8.89));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product add(Product product) {
        if (product.getProductId() == 0) {
            product.setProductId(lastProductId + 1);
            lastProductId++;
        }
        products.add(product);
        return product;
    }
}
