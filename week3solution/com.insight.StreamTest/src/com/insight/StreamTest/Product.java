package com.insight.StreamTest;

import java.time.LocalDate;

public class Product {
    Integer id;
    String name;
    String type;
    Double qty;
    Double price;
    LocalDate expiryDate;
    Supplier supplier;

    public Product(Integer id, String name, String type, Double qty, Double price, LocalDate expiryDate, Supplier supplier) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.qty = qty;
        this.price = price;
        this.expiryDate = expiryDate;
        this.supplier = supplier;
    }
}