package com.insight.StreamTask;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class ProductService {

    public static Optional<Product> highestPricedProduct(List<Product> products) {
        return products.stream().max(Comparator.comparing(Product::getPrice));
    }

    public static Optional<Product> lowestPricedProduct(List<Product> products) {
        return products.stream().min(Comparator.comparing(Product::getPrice));
    }

    public static List<Product> expiredProducts(List<Product> products) {
        LocalDate currentDate = LocalDate.now();
        return products.stream()
                .filter(product -> product.getExpiryDate().isBefore(currentDate))
                .collect(Collectors.toList());
    }

    public static List<String> productsExpiringInNext10Days(List<Product> products) {
        LocalDate currentDate = LocalDate.now();
        LocalDate tenDaysLater = currentDate.plusDays(10);
        return products.stream()
                .filter(product -> !product.getExpiryDate().isBefore(currentDate) && product.getExpiryDate().isBefore(tenDaysLater))
                .map(Product::getName)
                .collect(Collectors.toList());
    }

    public static Map<String, Long> countProductsByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType, Collectors.counting()));
    }
}
