class barangDemo{
    public static void main(String[] args) {
        Barang barang1 = new Barang();
        barang1.kode = "ATK01";
        barang1.nama = "bolpoint Pilot hitam";
        barang1.hargaKotor = 3500;
        barang1.discount = 0.1;
        barang1.displayInfo();

        Barang barang2 = new Barang();
        barang2.kode = "BKU05";
        barang2.nama = "Buku tulis Sinar Dunia";
        barang2.jenisBarang = "Perkakas Kantor";
        barang2.jumlahStok = 2000;
        barang2.hargaKotor = 5000;
        barang2.discount = 2;

        Barang barang3 = new Barang();
        barang3.kode = "RTI89";
        barang3.nama = "Sari Roti Coklat";
        barang3.jenisBarang = "Makanan";
        barang3.jumlahStok = 4000;
        barang3.hargaKotor = 5500;
        barang3.discount = 0;

        barang3.displayInfo();
        
    }
}