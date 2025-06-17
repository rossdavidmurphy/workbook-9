package com.pluarlsight.NorthwindTradersSpringBoot.repositories;

import com.pluarlsight.NorthwindTradersSpringBoot.models.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao {

    private List<Product> products = new ArrayList<>();
    private int lastProductId = 3;

    public SimpleProductDao() {
        products.add(new Product(1, "Coffee", "Beverage", 6.99));
        products.add(new Product(2, "Tea", "Beverage", 4.49));
        products.add(new Product(3, "Smoothie", "Beverage", 7.79));
    }

    @Override
    public List<Product> getAll() {
        return List.of();
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
