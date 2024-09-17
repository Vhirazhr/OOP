class RectagleDemo{
    public static void main(String[] args){
        Rectangle Rectangle1 = new Rectangle();
        Rectangle1.Panjang = 234;
        Rectangle1.Lebar = 456;
        Rectangle1.displayInfo();

        int luas = Rectangle1.getArea();
        System.out.println("luas:" + luas);
        
        int keliling = Rectangle1.getCircumference();
        System.out.println("keliling:" + keliling);

    }

}