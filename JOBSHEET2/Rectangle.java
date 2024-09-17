/**
 * Rectangle
 */
public class Rectangle {

    public int Panjang;
    public int Lebar;

    public void displayInfo() {
        System.out.println("Long: " + Panjang);
        System.out.println("Width: " + Lebar);
        
    }
    public  int getArea(){
        return Panjang * Lebar;
    }

    public int getCircumference(){
        return 2 * (Panjang + Lebar);
    }

}