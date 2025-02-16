package com.insightglobal.day4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ItemService {
    private List<Item> itemList = new ArrayList<>();

    // Load items from file
    public void loadItemsFromFile(String filename) throws IOException {
        FileReader f1 = new FileReader(filename);
        BufferedReader b = new BufferedReader(f1);
        String line;
        
        while ((line = b.readLine()) != null) {
            String[] data = line.split(",");
            Integer id = Integer.parseInt(data[0].trim());
            String name = data[1].trim();
            Integer qty = Integer.parseInt(data[2].trim());
            Double price = Double.parseDouble(data[3].trim());
            itemList.add(new Item(id, name, qty, price));
        }
        b.close();
    }

    // Get price by item id
    public Double getPriceById(Integer id) {
        for (Item i : itemList) {
            if (i.getId().equals(id)) {
                return i.getPrice();
            }
        }
        return null; // Return null if item not found
    }

    // Get item by id
    public Item getItemById(Integer id) {
        for (Item i : itemList) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        return null; // Return null if item not found
    }

    // Get all items
    public List<Item> listItems() {
        return itemList;
    }
}
