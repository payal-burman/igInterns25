package com.insight.StreamTask;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ProductMain {
    public static void main(String[] args) {
       
        List<Product> productList = Arrays.asList(
                new Product(1, "Milk", "dairy", 20.0, 30.0, LocalDate.of(2023, 12, 15)),
                new Product(2, "Wheat", "pulses", 50.0, 20.0, LocalDate.of(2024, 3, 10)),
                new Product(3, "Rice", "pulses", 100.0, 10.0, LocalDate.of(2023, 12, 5)),
                new Product(4, "Cheese", "dairy", 15.0, 40.0, LocalDate.of(2023, 11, 10)),
                new Product(5, "Sunflower Oil", "oils", 5.0, 70.0, LocalDate.of(2024, 1, 25)),
                new Product(6, "Snacks", "snacks", 30.0, 25.0, LocalDate.of(2023, 10, 31)),
                new Product(7, "Coriander", "spices", 10.0, 10.0, LocalDate.of(2023, 12, 1))
        );
        
        Optional<Product> highestPriceProduct = ProductService.highestPricedProduct(productList);
        highestPriceProduct.ifPresent(product -> System.out.println("Highest Priced Product: " + product));

        Optional<Product> lowestPriceProduct = ProductService.lowestPricedProduct(productList);
        lowestPriceProduct.ifPresent(product -> System.out.println("Lowest Priced Product: " + product));

        List<Product> expiredProducts = ProductService.expiredProducts(productList);
        System.out.println("Expired Products:");
        expiredProducts.forEach(System.out::println);

        List<String> productsExpiringInNext10Days = ProductService.productsExpiringInNext10Days(productList);
        System.out.println("Products Expiring in the Next 10 Days: " + productsExpiringInNext10Days);

        Map<String, Long> productTypeCount = ProductService.countProductsByType(productList);
        System.out.println("Product Count by Type: " + productTypeCount);
    }
}
