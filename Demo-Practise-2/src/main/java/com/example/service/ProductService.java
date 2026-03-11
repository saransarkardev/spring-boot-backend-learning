package com.example.service;

import com.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {


    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone 14 Plus", 60000),
            new Product(102, "Samsung S25 Ultra", 90000),
            new Product(103, "Airpods 3 pro", 30000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().get();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = 0;

        for (int i=0; i<products.size(); i++) {
            if (products.get(i).getProdId() == product.getProdId()) {
                index = i;
                break;
            }
        }

        products.set(index, product);
    }

    public void deleteProductById(int prodId) {
        int index = 0;
        for (int i=0; i<products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                index = i;
                break;
            }
        }

        products.remove(index);
    }
}
