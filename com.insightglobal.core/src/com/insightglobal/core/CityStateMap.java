package com.insightglobal.core;

import java.util.*;

public class CityStateMap {
    // This will store the city-state pairs
    private Map<String, String> cityToStateMap;

    public CityStateMap() {
        cityToStateMap = new HashMap<>();
    }

    public Set<String> getAllCities() {
        return cityToStateMap.keySet();
    }

    public Set<String> getAllStates() {
        return new HashSet<>(cityToStateMap.values());
    }

    // Get cities for a specific state
    public List<String> getCitiesForState(String state) {
        List<String> citiesForState = new ArrayList<>();
        for (Map.Entry<String, String> entry : cityToStateMap.entrySet()) {
            if (entry.getValue().equals(state)) {
                citiesForState.add(entry.getKey());
            }
        }
        return citiesForState;
    }

    // Add a new city-state pair
    public void addCityStatePair(String city, String state) {
        cityToStateMap.put(city, state);  // This will replace any existing entry with the same city
    }

    // Delete all cities for a given state
    public void deleteCitiesForState(String state) {
        cityToStateMap.values().removeIf(value -> value.equals(state));
    }

    // Read city-state data from a file and store in the map
    public void loadDataFromFile(String fileName) {
        try (Scanner scanner = new Scanner(new java.io.File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] cityState = line.split(",");
                if (cityState.length == 2) {
                    addCityStatePair(cityState[0].trim(), cityState[1].trim());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Main method 
    public static void main(String[] args) {
        CityStateMap cityStateMap = new CityStateMap();

        // Add city-state pairs
        cityStateMap.addCityStatePair("New York", "New York");
        cityStateMap.addCityStatePair("Los Angeles", "California");
        cityStateMap.addCityStatePair("Chicago", "Illinois");

        // Test all operations
        System.out.println("All Cities: " + cityStateMap.getAllCities());
        System.out.println("All States: " + cityStateMap.getAllStates());
        System.out.println("Cities in California: " + cityStateMap.getCitiesForState("California"));

        // Add new city-state pair (Duplicate city - it will replace the previous entry)
        cityStateMap.addCityStatePair("Chicago", "New Illinois");

        // Test all operations after adding new pair
        System.out.println("After adding new pair:");
        System.out.println("All Cities: " + cityStateMap.getAllCities());
        System.out.println("All States: " + cityStateMap.getAllStates());
        System.out.println("Cities in Illinois: " + cityStateMap.getCitiesForState("Illinois"));

        // Delete all cities for a given state
        cityStateMap.deleteCitiesForState("California");
        System.out.println("After deleting cities in California:");
        System.out.println("All Cities: " + cityStateMap.getAllCities());
    }
}
