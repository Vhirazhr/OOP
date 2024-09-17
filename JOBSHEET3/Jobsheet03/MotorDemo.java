package Jobsheet03;

public class MotorDemo {

    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.displayStatus();

        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayStatus();

        Motor motor2 = new Motor();
        motor2.displayStatus();

        motor2.setPlatNomor("N 9840 AB");
        motor2.setMesinOn(true);
        motor2.setKecepatan(70);
        motor2.displayStatus();

        Motor motor3 = new Motor();
        motor3.displayStatus();

        motor3.setPlatNomor("B 0838 XZ");
        motor3.setMesinOn(true);
        motor3.setKecepatan(120);
        motor3.displayStatus();
    }
}
