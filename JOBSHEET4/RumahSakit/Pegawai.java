public class Pegawai {
    private String nip;
    private String name;

    public Pegawai (String nip, String nama) {
        this.nip = nip;
        this.name = name;
    }

    public String getNip() {
        return  nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public String getNama() {
        return name;
    }
    public void setNama(String name) {
        this.name = name;
    }
    public String getInfo() {
        return name + " (" + nip + ")";
    }
}
