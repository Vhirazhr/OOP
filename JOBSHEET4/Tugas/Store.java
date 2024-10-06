package Tugas;
import java.util.ArrayList; 
import Tugas.Product; 
import Tugas.Customer; 

public class Store {
    ArrayList<Product> productList = new ArrayList<>();
    ArrayList<String> transactionHistory = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Product: " + product.getProductName() + " added to this Store.");
    }

    public void sellProduct(Customer customer, Product product, int quantity) {
        customer.buyProduct(product, quantity);
        transactionHistory.add(customer.getName() + " bought " + quantity + " unit(s) of " + product.getProductName());
    }

    public void showProductList() {
        System.out.printf("%-15s %-30s %-10s %-10s%n", "Serial Number", "Product Name", "Price", "Stock");
        for (Product product : productList) {
            product.getDetails();
        }
    }

    public void increaseStock(Product product, int quantity) {
        product.increaseStock(quantity);
    }

    public void decreaseStock(Product product, int quantity) {
        product.decreaseStock(quantity);
    }

    public void showTransactionHistory(ArrayList<Customer> customers) {
        System.out.println("Transaction History:");
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName());
            System.out.println("Address: " + customer.getAddress());
            System.out.println("Phone Number: " + customer.getPhoneNumber());
            System.out.println("Purchased Products:");

            double totalCost = 0;

            for (int i = 0; i < customer.getPurchasedProducts().size(); i++) {
                Product product = customer.getPurchasedProducts().get(i);
                int quantity = customer.getPurchasedQuantities().get(i);
                double productCost = product.getPrice() * quantity;
                totalCost += productCost;

                System.out.println("- " + product.getSerialNumber() + ": " + product.getProductName() +
                        " (x" + quantity + ") @ Rp" + product.getPrice() + " = Rp" + productCost);
            }
            System.out.println("Total cost for " + customer.getName() + ": Rp" + String.format("%.2f", totalCost));
            System.out.println();
        }
    }

    public void showTotalSales(ArrayList<Customer> customers) {
        System.out.println("Total Sales of the Day:");
        double totalSales = 0;

        for (Customer customer : customers) {
            double customerTotal = 0;

            for (int i = 0; i < customer.getPurchasedProducts().size(); i++) {
                Product product = customer.getPurchasedProducts().get(i);
                int quantity = customer.getPurchasedQuantities().get(i);
                customerTotal += product.getPrice() * quantity;
            }

            System.out.printf("Customer: %s, Total: Rp%.2f%n", customer.getName(), customerTotal);
            totalSales += customerTotal;
        }

        System.out.printf("Total Sales for the Day: Rp%.2f%n", totalSales);
    }

    public void showSalesSummary(ArrayList<Customer> customers) {
        System.out.printf("%-15s %-30s %-10s %-10s%n", "Serial Number", "Product Name", "Sold", "Remaining Stock");
        for (Product product : productList) {
            int soldQuantity = 0;

            for (Customer customer : customers) {
                for (int i = 0; i < customer.getPurchasedProducts().size(); i++) {
                    if (customer.getPurchasedProducts().get(i).getSerialNumber().equals(product.getSerialNumber())) {
                        soldQuantity += customer.getPurchasedQuantities().get(i);
                    }
                }
            }

            System.out.printf("%-15s %-30s %-10d %-10d%n",
                    product.getSerialNumber(),
                    product.getProductName(),
                    soldQuantity,
                    product.getStock());
        }
    }
}
