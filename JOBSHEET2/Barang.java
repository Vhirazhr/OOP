class Barang{
    public String kode;
    public String nama;
    public String jenisBarang;
    public int jumlahStok;
    public double  hargaKotor;
    public double  discount;

    public double getHargaBersih(){
        return hargaKotor - discount * hargaKotor;
    }

    public void displayInfo() {
        System.out.println("kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("Jenis barang: " + jenisBarang);
        System.out.println("Jumlah Stok : " + jumlahStok);
        System.out.println("harga kotor : " + hargaKotor);
        System.out.println("Discount    : " + discount);
        System.out.println("Harga Bersih: " + getHargaBersih());

        
    }
}