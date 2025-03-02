package com.insight.StreamTask;

import java.time.LocalDate;

class Product {
    Integer id;
    String name;
    String type;  
    Double qty;
    Double price;
    LocalDate expiryDate;

    public Product(Integer id, String name, String type, Double qty, Double price, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.qty = qty;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }
    public Double getQty() { return qty; }
    public Double getPrice() { return price; }
    public LocalDate getExpiryDate() { return expiryDate; }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', type='" + type + "', qty=" + qty + ", price=" + price + ", expiryDate=" + expiryDate + '}';
    }
}
