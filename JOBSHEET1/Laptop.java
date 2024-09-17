/**
 * Laptop
 */
public class Laptop {

    public static void main(String[] args) {
        String merk1, merk2, merk3, merk4, merk5, merk6, merk7, merk8, merk9, merk10;
        int storage, storage2, storage3, storage4, storage5, storage6, storage7,
                storage8, storage9, storage10, battery, battery2, battery3, battery4, battery5,
                battery6, battery7, battery8, battery9, battery10;

        merk1 = "Asus";
        storage = 172;
        battery = 60;

        merk2 = "Lenovo";
        storage2 = 218;
        battery2 = 30;

        merk3 = "MSI";
        storage3 = 516;
        battery3 = 60;

        merk4 = "Thinkpad";
        storage4 = 516;
        battery4 = 50;

        merk5 = "Acer";
        storage5 = 516;
        battery5 = 80;

        merk6 = "HP";
        storage6 = 1020;
        battery6 = 30;

        merk7 = "Macbook";
        storage7 = 516;
        battery7 = 10;

        merk8 = "ROG";
        storage8 = 218;
        battery8 = 60;

        merk9 = "Huawei";
        storage9 = 1020;
        battery9 = 5;

        merk10 = "Asus Limited Edition";
        storage10 = 1020;
        battery10 = 100;

        storage = decracement(storage, 50);
        storage2 = decracement(storage2, 10);
        storage3 = decracement(storage3, 20);
        storage4 = decracement(storage4, 30);
        storage5 = decracement(storage5, 60);
        storage6 = decracement(storage6, 40);
        storage7 = decracement(storage7, 25);
        storage8 = decracement(storage8, 40);
        storage9 = decracement(storage9, 25);
        storage10 = decracement(storage10, 30);

        showLaptopInformation(merk1, storage, battery);
        showLaptopInformation(merk2, storage2, battery2);
        showLaptopInformation(merk3, storage3, battery3);
        showLaptopInformation(merk4, storage4, battery4);
        showLaptopInformation(merk5, storage5, battery5);
        showLaptopInformation(merk6, storage6, battery6);
        showLaptopInformation(merk7, storage7, battery7);
        showLaptopInformation(merk8, storage8, battery8);
        showLaptopInformation(merk9, storage9, battery9);
        showLaptopInformation(merk10, storage10, battery10);
    }

    public static int decracement(int storage, int decrement) {
        return storage - decrement;
    }

    public static void showLaptopInformation(String merk, int storage, int battery) {
        System.out.println("Merk: " + merk);
        System.out.println("Storage: " + storage + "GB");
        batteryCheckStatus(merk, battery);
    }

    public static void batteryCheckStatus(String merk, int battery) {
        if (battery > 80) {
            System.out.println("Laptop " + merk + " battery full in charge.");
        } else if (battery > 50) {
            System.out.println("Laptop " + merk + " battery enough.");
        } else if (battery > 20) {
            System.out.println("Laptop " + merk + " battery weak.");
        } else {
            System.out.println("Laptop " + merk + " less battery, need to charge!");
        }
    }
}
