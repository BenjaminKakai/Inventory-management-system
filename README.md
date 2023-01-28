# Inventory-management-system
To implement the inventory management system on a Redmi device, you can use the Java programming language to create the classes and methods outlined in the previous code example. You would then need to use the Android operating system to create a user interface and connect it to the Java code.

Here is an example of how the main activity class in the Android app could look like:

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Inventory inventory;
    private BarcodeScanner scanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inventory = new Inventory();
        scanner = new BarcodeScanner();

        Button addProductButton = findViewById(R.id.addProductButton);
        addProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNewProduct();
            }
        });

        Button updateProductButton = findViewById(R.id.updateProductButton);
        updateProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateProduct();
            }
        });

        // similar listener for delete and check stock button
    }

    private void addNewProduct() {
        EditText nameEditText = findViewById(R.id.nameEditText);
        EditText quantityEditText = findViewById(R.id.quantityEditText);
        EditText priceEditText = findViewById(R.id.priceEditText);

        String name = nameEditText.getText().toString();
        int quantity = Integer.parseInt(quantityEditText.getText().toString());
        double price = Double.parseDouble(priceEditText.getText().toString());

        Product product = new Product(name, quantity, price);
        inventory.addProduct(product);

        Toast.makeText(this, "Product added to inventory", Toast.LENGTH_SHORT).show();
    }

    private void updateProduct() {
        EditText nameEditText = findViewById(R.id.nameEditText);
        EditText quantityEditText = findViewById(R.id.quantityEditText);
        EditText priceEditText = findViewById(R.id.priceEditText);

        String name = nameEditText.getText().toString();
        int quantity = Integer.parseInt(quantityEditText.getText().toString());
        double price = Double.parseDouble(priceEditText.getText().toString());

        Product product = new Product(name, quantity, price);
        inventory.updateProduct(product);

        Toast.makeText(this, "Product updated in inventory", Toast.LENGTH_SHORT).show();
    }
    // similar methods for delete and check stock
}

This class uses the layout defined in the XML file activity_main.xml to create the user interface and connect it to the Java code. Users can add new products, update existing products, delete products,
