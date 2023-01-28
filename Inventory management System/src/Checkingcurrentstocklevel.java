import java.util.Scanner;

public class Inventory {
    // Fields and constructor

    public void checkStock() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the product name or ID to check stock: ");
        String name = input.nextLine();

        // Search for the product in the database
        // You can use JDBC to connect to the database and
        // search for the product using the name or ID
        // code to search for the product in the database

        if (productExists) {
            // retrieve the stock level of the product
            // You can use JDBC to connect to the database and
            // retrieve the stock level of the product
            // code to retrieve the stock level of the product

            System.out.println("Current stock level of " + name + " is: " + stockLevel);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }
}
