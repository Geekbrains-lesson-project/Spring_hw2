package ru.geekbrains.HomeWork_2.market;



import ru.geekbrains.HomeWork_2.domain.Product;

import java.util.List;

public interface Cart {
    void addProduct(int id);
    void deleteProduct(int id);
    void clear();
    List<Product> getProducts();
}

