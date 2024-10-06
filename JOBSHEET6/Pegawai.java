public class Pegawai {
    public String nip;
    public String name;
    public double gaji;

    public Pegawai (){
        System.out.println("Object dari class Pegawai dibuat");
    }

    public String getInfo (){
        String info = "";
        info += "NIP : " + nip + "\n";
        info += "Nama : " + name + "\n";
        info += "Gaji : " + gaji + "\n";
        return info;
    }
}