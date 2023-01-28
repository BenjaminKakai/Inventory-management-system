import java.util.Scanner;

public class Inventory {
    //Fields and constructor

    public void addProduct() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String name = input.nextLine();
        System.out.print("Enter product price: ");
        double price = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        Product newProduct = new Product(name, price, quantity);

        // Add new product to the database
        // You can use JDBC to connect to the database and
        // Insert the data into the database
        // code to add data to the database

        System.out.println("Product added to inventory successfully!");
    }
}
