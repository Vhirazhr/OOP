package testpackage;

public class Pegawai {
    public String nip;
    public String name;
    public double gaji;

   public Pegawai (){
       System.out.println("Object dari class Pegawai dibuat");
    }

    public Pegawai (String nip, String name, double gaji) {
        this.nip = nip;
        this.name = name;
        this.gaji = gaji;
    }

    public String getInfo (){
        String info = "";
        info += "NIP : " + nip + "\n";
        info += "Nama : " + name + "\n";
        info += "Gaji : " + gaji + "\n";
        return info;
    }
}