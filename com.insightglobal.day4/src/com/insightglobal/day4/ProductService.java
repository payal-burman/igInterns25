package com.insightglobal.day4;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    static List<Product> plist = new ArrayList<>();

    public String addProduct(Product p) {
        plist.add(p);
        return "success";
    }

    public int deleteProduct(Product p) {
        boolean removed = plist.removeIf(product -> product.getId().equals(p.getId()));
        return removed ? 1 : 0; 
    }

    public int updateProduct(Product p) {
        for (int i = 0; i < plist.size(); i++) {
            Product currentProduct = plist.get(i);
            if (currentProduct.getId().equals(p.getId())) {
                currentProduct.setName(p.getName()); 
                return 1; 
            }
        }
        return 0; 
    }

    public void listProducts() {
        for (Product product : plist) {
            System.out.println(product);
        }
    }

    public Product getProduct(Integer id) {
        for (Product product : plist) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;  
    }
}
