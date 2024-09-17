import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasil = 0;


        if (operator == '+') {
            hasil = tambah(angka1, angka2);
        } else if (operator == '-') {
            hasil = kurang(angka1, angka2);
        } else if (operator == '*') {
            hasil = kali(angka1, angka2);
        } else if (operator == '/') {
            hasil = bagi(angka1, angka2);
        } else {
            System.out.println("Operator tidak valid! Gunakan salah satu dari berikut: +, -, *, /");
            scanner.close();
            return;
        }

        System.out.println("Hasil: " + hasil);
        scanner.close();
    }

    public static double tambah(double a, double b) {
        return a + b;
    }

    public static double kurang(double a, double b) {
        return a - b;
    }

    public static double kali(double a, double b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Kesalahan! Pembagian dengan nol.");
            return 0;
        }
        return a / b;
    }
}
