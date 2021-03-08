package ru.geekbrains.HomeWork_2.market;



import ru.geekbrains.HomeWork_2.domain.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductRepositoryImpl implements ProductRepository {
    private final List<Product> productList;

    public ProductRepositoryImpl(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public Product getProductById(int id) {
        Optional<Product> product = productList.stream().filter(p -> p.getId() == id).findFirst();
        return product.orElse(null);
    }
}
