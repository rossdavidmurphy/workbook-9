package com.pluarlsight.NorthwindTradersSpringBoot;

import com.pluarlsight.NorthwindTradersSpringBoot.models.Product;
import com.pluarlsight.NorthwindTradersSpringBoot.repositories.ProductDao;
import com.pluarlsight.NorthwindTradersSpringBoot.repositories.SimpleProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Main implements CommandLineRunner {

	@Autowired
	SimpleProductDao productDao;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Product> products = productDao.getAll();
		System.out.println(products);
	}
}
