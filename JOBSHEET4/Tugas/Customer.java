
package Tugas;
import java.util.ArrayList; 
import Tugas.Product; 
import Tugas.Store; 

public class Customer {
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Product> purchasedProducts = new ArrayList<>();
    private ArrayList<Integer> purchasedQuantities = new ArrayList<>();

    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void buyProduct(Product product, int quantity) {
        if (product.getStock() >= quantity) {
            product.decreaseStock(quantity);
            purchasedProducts.add(product);
            purchasedQuantities.add(quantity);
        } else {
            System.out.println("Purchase failed, insufficient stock for " + product.getProductName());
        }
    }

    public ArrayList<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public ArrayList<Integer> getPurchasedQuantities() {
        return purchasedQuantities;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}


