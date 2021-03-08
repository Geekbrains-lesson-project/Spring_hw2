
package ru.geekbrains.HomeWork_2.market;

import ru.geekbrains.HomeWork_2.domain.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getProductList();
    Product getProductById(int id);
}
