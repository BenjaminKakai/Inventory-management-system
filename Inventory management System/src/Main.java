import java.util.*;

public class InventoryManagementSystem {
    private Inventory inventory;
    private BarcodeScanner scanner;

    public InventoryManagementSystem() {
        inventory = new Inventory();
        scanner = new BarcodeScanner();
    }

    public void run() {
        while (true) {
            System.out.println("1. Add new product to inventory");
            System.out.println("2. Update existing product");
            System.out.println("3. Delete product from inventory");
            System.out.println("4. Check current stock levels");
            System.out.println("5. Generate sales and inventory reports");
            System.out.println("6. Scan barcode for adding, updating, and checking stock");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = getChoiceFromUser();
            switch (choice) {
                case 1:
                    addNewProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    checkStock();
                    break;
                case 5:
                    generateReports();
                    break;
                case 6:
                    scanBarcode();
                    break;
                case 7:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private int getChoiceFromUser() {
        // code to get choice from the user
    }

    private void addNewProduct() {
        Product product = inventory.getProductFromUser();
        inventory.addProduct(product);
    }

    private void updateProduct() {
        Product product = inventory.getProductFromUser();
        inventory.updateProduct(product);
    }

    private void deleteProduct() {
        Product product = inventory.getProductFromUser();
        inventory.deleteProduct(product);
    }

    private void checkStock() {
        Product product = inventory.getProductFromUser();
        inventory.checkStock(product);
    }

    private void generateReports() {
        inventory.generateReports();
    }

    private void scanBarcode() {
        System.out.print("Enter the barcode: ");
        String barcode = getBarcodeFromUser();
        scanner.scanBarcode(barcode);
    }

    private String getBarcodeFromUser() {
        // code to get barcode from the user
    }

    private void exit() {
        System.out.println("Exiting the inventory management system. Goodbye!");
        System.exit(0);
    }

    public static void main(String[] args) {
        InventoryManagementSystem system = new InventoryManagementSystem();
        system.run();
    }
}
