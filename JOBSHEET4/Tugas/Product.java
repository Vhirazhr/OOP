
package Tugas;
import java.util.ArrayList; 
import Tugas.Store; 
import Tugas.Customer; 

public class Product {
    private String serialNumber;
    private String productName;
    private double price;
    private int stock;

    public Product(String serialNumber, String productName, double price, int stock) {
        this.serialNumber = serialNumber;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public void getDetails() {
        System.out.printf("%-15s %-30s %-10.2f %-10d%n", serialNumber, productName, price, stock);
    }

    public void decreaseStock(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
            System.out.println("Stock Decreased " + quantity + ". New stock: " + stock);
        } else {
            System.out.println("Not Enough Stock!");
        }
    }

    public void increaseStock(int quantity) {
        stock += quantity;
        System.out.println("Stock increased " + quantity + ". New stock: " + stock);
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }
}


