package com.insight.StreamTest;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating Suppliers
        Supplier supplier1 = new Supplier(1, "ABC Traders");
        Supplier supplier2 = new Supplier(2, "XYZ Suppliers");

        // Creating Products
        List<Product> productList = Arrays.asList(
            new Product(1, "Milk", "Dairy", 2.0, 50.0, LocalDate.now().plusDays(5), supplier1),
            new Product(2, "Rice", "Pulses", 5.0, 80.0, LocalDate.now().plusDays(15), supplier2),
            new Product(3, "Sugar", "Spices", 1.0, 40.0, LocalDate.now().minusDays(2), supplier1),
            new Product(4, "Oil", "Oils", 3.0, 150.0, LocalDate.now().plusDays(8), supplier2),
            new Product(5, "Chips", "Snacks", 10.0, 20.0, LocalDate.now().minusDays(1), supplier1)
        );

        // Initializing ProductService
        ProductService productService = new ProductService(productList);

        // Get highest priced product
        productService.getHighestPricedProduct().ifPresent(p -> System.out.println("Highest Priced Product: " + p.name));

        // Get lowest priced product
        productService.getLowestPricedProduct().ifPresent(p -> System.out.println("Lowest Priced Product: " + p.name));

        // List expired products
        System.out.println("Expired Products: " + productService.getExpiredProducts().stream().map(p -> p.name).toList());

        // Products expiring in next 10 days
        System.out.println("Products Expiring Soon: " + productService.getProductsExpiringSoon());

        // Count of product types
        System.out.println("Product Type Count: " + productService.getProductTypeCount());

        // Count of products by supplier
        System.out.println("Product Count by Supplier: " + productService.getProductCountBySupplier());
    }
}
