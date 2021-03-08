package ru.geekbrains.HomeWork_2.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.geekbrains.HomeWork_2.domain.Product;
import ru.geekbrains.HomeWork_2.market.Cart;
import ru.geekbrains.HomeWork_2.market.CartImpl;
import ru.geekbrains.HomeWork_2.market.ProductRepository;
import ru.geekbrains.HomeWork_2.market.ProductRepositoryImpl;

import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Product> productList() {
        return List.of(
                new Product(1, "Gold", 999),
                new Product(2, "Silver", 888),
                new Product(3, "Bronze", 777),
                new Product(4, "Wood", 666),
                new Product(5, "Paper", 555)
        );
    }

    @Bean
    @Scope("prototype")
    public Cart cart(ProductRepository productRepository) {
        return new CartImpl(productRepository) ;
    }

    @Bean
    public ProductRepository productRepository(List<Product> productList) {
        return new ProductRepositoryImpl(productList);
    }


}

