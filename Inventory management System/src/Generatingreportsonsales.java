import java.util.*;

public class Inventory {
    // Fields and constructor

    public void generateReport() {
        // Connect to the database to retrieve sales and inventory data
        // You can use JDBC to connect to the database and
        // retrieve sales and inventory data
        // code to retrieve sales and inventory data

        // Create a map to store the sales data
        Map<String, Double> salesData = new HashMap<>();

        // Add data to the map
        // code to add data to the salesData map

        // Create a map to store the inventory data
        Map<String, Integer> inventoryData = new HashMap<>();

        // Add data to the map
        // code to add data to the inventoryData map

        // Print the report
        System.out.println("Sales Report:");
        for (Map.Entry<String, Double> entry : salesData.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
        System.out.println("Inventory Report:");
        for (Map.Entry<String, Integer> entry : inventoryData.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
