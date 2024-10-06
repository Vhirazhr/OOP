package inheritance;
import testpackage.Pegawai;

public class Dosen extends Pegawai{
    public String nidn;

    public Dosen() {
        System.out.println(gaji);
        System.out.println("Object dari class Dosen dibuat");
    }

    public String getInfo(){
        return "NIDN : " + this.nidn + "\n";
    }

    public String getAllInfo () {
        String info = super.getInfo();
        info += this.getInfo();
        return info;
    }
}
