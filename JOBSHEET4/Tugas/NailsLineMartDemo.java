package Tugas;
import java.util.ArrayList;
import java.util.Scanner;

import Tugas.Product; 
import Tugas.Store; 
import Tugas.Customer; 
/**
 * Nail'sLineMartDemo
 */
public class NailsLineMartDemo {
    public static void main(String[] args) {
        Store store = new Store();
        Scanner scanner = new Scanner(System.in);

        // Menambahkan produk
    
        store.addProduct(new Product("120", "Nail Polish RGB", 30000.0, 100));
        store.addProduct(new Product("130", "Nail Polish YMCK", 35000.0, 100));
        store.addProduct(new Product("210", "Nail Sticker Diamon", 2900.0, 100));
        store.addProduct(new Product("310", "Nail Gliter", 2900.0, 100));
        store.addProduct(new Product("410", "Nail Art Brush Pink", 40000.0, 50));
        store.addProduct(new Product("140", "Nail Cat Eye", 40000.0, 50));
        store.addProduct(new Product("150", "Top Coat", 10000.0, 100));
        store.addProduct(new Product("510", "Toner Aseton", 5000.0, 100));
        store.addProduct(new Product("520", "UV Light", 100000.0, 10));
        store.addProduct(new Product("610", "Glue Gell", 2500.0, 100));

        // Menambahkan pelanggan
        Customer customer1 = new Customer("Fakhira", "Jl.Letjen Malang", "0812345678");
        Customer customer2 = new Customer("Zahrany", "Jl. Parman Bogor", "08987654321");
        Customer customer3 = new Customer("Nardin", "Jl. Soekarno Hatta", "08987654321");
        Customer customer4 = new Customer("Araa", "Jl. Belimbing Malang", "08987654398");
        Customer customer5 = new Customer("Hiraa", "Jl. Kota Malang", "08986754398");

        // Menambahkan ArrayList customer untuk histori transaksi
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);

        int choice;

        do {
            System.out.println("==== Welcome to Nail's Line Mart ====");
            System.out.println("1. Product List");
            System.out.println("2. Stock Management");
            System.out.println("3. Purchase History");
            System.out.println("4. Total Sales");
            System.out.println("5. Sales Summary");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    store.showProductList();
                    break;

                case 2:
                    store.showProductList(); // Menampilkan daftar produk sebelum mengelola stok
                    System.out.print("Enter product serial number to adjust stock: ");
                    String serialNumber = scanner.next();
                    Product selectedProduct = null;

                    // Mencari produk berdasarkan nomor seri
                    for (Product product : store.productList) {
                        if (product.getSerialNumber().equals(serialNumber)) {
                            selectedProduct = product;
                            break;
                        }
                    }

                    if (selectedProduct != null) {
                        System.out.print("Increase or decrease stock? (1 for increase, 2 for decrease): ");
                        int stockChoice = scanner.nextInt();
                        System.out.print("Enter quantity: ");
                        int quantity = scanner.nextInt();
                        
                        if (stockChoice == 1) {
                            store.increaseStock(selectedProduct, quantity);
                        } else if (stockChoice == 2) {
                            store.decreaseStock(selectedProduct, quantity);
                        } else {
                            System.out.println("Invalid choice for stock adjustment.");
                        }
                    } else {
                        System.out.println("Product with serial number " + serialNumber + " not found.");
                    }
                    break;

                case 3:
                
                    customer1.buyProduct(store.productList.get(1), 1);  
                    customer1.buyProduct(store.productList.get(2), 1);
                    customer1.buyProduct(store.productList.get(8), 3);   
                    customer2.buyProduct(store.productList.get(0), 1);  
                    customer2.buyProduct(store.productList.get(2), 4);  
                    customer3.buyProduct(store.productList.get(4), 6);
                    customer3.buyProduct(store.productList.get(5), 3);
                    customer4.buyProduct(store.productList.get(5), 2);
                    customer5.buyProduct(store.productList.get(1), 1);
                    customer5.buyProduct(store.productList.get(2), 3);
                    customer5.buyProduct(store.productList.get(8), 1);
                    customer5.buyProduct(store.productList.get(7), 3);
                    
                    store.showTransactionHistory(customers);
                    break;

                    case 4:
                    store.showTotalSales(customers); 
                    break;

                case 5:
                    store.showSalesSummary(customers);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 6);
        
        scanner.close();
    }
    
}