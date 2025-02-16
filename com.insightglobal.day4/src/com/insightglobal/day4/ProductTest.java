package com.insightglobal.day4;

import java.util.Scanner;

public class ProductTest {

    public static void main(String[] args) {
        ProductService ps = new ProductService();
        Scanner scanner = new Scanner(System.in); 

        while (true) {
            System.out.println("Product Management System");
            System.out.println("1. Add Product");
            System.out.println("2. List Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Get Product by ID");
            System.out.println("6. Exit");

            System.out.print("Enter your choice (1-6): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:  
                    System.out.print("Enter product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    Product newProduct = new Product(id, name);
                    String result = ps.addProduct(newProduct);
                    System.out.println("Result: " + result);
                    break;

                case 2:  
                    System.out.println("Listing all products:");
                    ps.listProducts();
                    break;

                case 3: 
                    System.out.print("Enter product ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter new product name: ");
                    String updatedName = scanner.nextLine();
                    Product updatedProduct = new Product(updateId, updatedName);
                    int updateResult = ps.updateProduct(updatedProduct);
                    if (updateResult == 1) {
                        System.out.println("Product updated successfully!");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 4:  
                    System.out.print("Enter product ID to delete: ");
                    int deleteId = scanner.nextInt();
                    Product productToDelete = new Product(deleteId, "");
                    int deleteResult = ps.deleteProduct(productToDelete);
                    if (deleteResult == 1) {
                        System.out.println("Product deleted successfully!");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5: 
                    System.out.print("Enter product ID to get: ");
                    int getId = scanner.nextInt();
                    Product fetchedProduct = ps.getProduct(getId);
                    if (fetchedProduct != null) {
                        System.out.println("Product found: " + fetchedProduct);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 6: 
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;  

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();  
        }
    }
}
