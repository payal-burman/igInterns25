package com.insightglobal.day4;

import java.io.IOException;

public class IODemoApp {
    public static void main(String[] args) throws IOException {
        ItemService itemService = new ItemService();
        
        // Load items from file
        itemService.loadItemsFromFile("C:\\Users\\<payal-burman>\\Desktop\\item.txt");
        
        // Display all items
        System.out.println("All Items:");
        for (Item item : itemService.listItems()) {
            System.out.println(item);
        }

        // 1. Get price of an item by ID
        Integer itemIdForPrice = 10;
        Double price = itemService.getPriceById(itemIdForPrice);
        if (price != null) {
            System.out.println("Price of item with ID " + itemIdForPrice + " is: " + price);
        } else {
            System.out.println("Item with ID " + itemIdForPrice + " not found.");
        }

        // 2. Get item details by ID
        Integer itemIdForDetails = 10;
        Item item = itemService.getItemById(itemIdForDetails);
        if (item != null) {
            System.out.println("Details of item with ID " + itemIdForDetails + ": " + item);
        } else {
            System.out.println("Item with ID " + itemIdForDetails + " not found.");
        }
    }
}
