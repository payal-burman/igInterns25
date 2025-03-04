package com.insight.StreamTest;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ProductService {
    private List<Product> products;

    public ProductService(List<Product> products) {
        this.products = products;
    }

    // List highest priced product
    public Optional<Product> getHighestPricedProduct() {
        return products.stream().max(Comparator.comparingDouble(p -> p.price));
    }

    // List lowest priced product
    public Optional<Product> getLowestPricedProduct() {
        return products.stream().min(Comparator.comparingDouble(p -> p.price));
    }

    // List products that already expired
    public List<Product> getExpiredProducts() {
        return products.stream().filter(p -> p.expiryDate.isBefore(LocalDate.now())).collect(Collectors.toList());
    }

    // List product names that will expire in the next 10 days
    public List<String> getProductsExpiringSoon() {
        LocalDate today = LocalDate.now();
        return products.stream()
                .filter(p -> !p.expiryDate.isBefore(today) && p.expiryDate.isBefore(today.plusDays(10)))
                .map(p -> p.name)
                .collect(Collectors.toList());
    }

    // Display count of products of different types
    public Map<String, Long> getProductTypeCount() {
        return products.stream().collect(Collectors.groupingBy(p -> p.type, Collectors.counting()));
    }

    // Display count of products based on Supplier name
    public Map<String, Long> getProductCountBySupplier() {
        return products.stream().collect(Collectors.groupingBy(p -> p.supplier.sname, Collectors.counting()));
    }
}
