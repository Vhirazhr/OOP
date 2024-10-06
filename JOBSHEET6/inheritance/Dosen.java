package inheritance;
import testpackage.Pegawai;

public class Dosen extends Pegawai{
    public String nidn;

    public Dosen() {
        System.out.println(gaji);
        System.out.println("Object dari class Dosen dibuat");
    }

    public String getAllInfo () {
        String info = "";
        info += "Nama : " + super.name + "\n";
        info += "NIP : " + super.nip + "\n";
        info += "Gaji : " + super.gaji + "\n";
        info += "NIDN : " + this.nidn + "\n";
        return info;
    }
}
