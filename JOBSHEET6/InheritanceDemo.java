public class InheritanceDemo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
        dosen1.name = "Yansy Ayuningtias";
        dosen1.nip = "1234567890";
        dosen1.gaji = 3000000;
        dosen1.nidn = "1989432439";

        System.out.println(dosen1.getInfo());
    }
}
