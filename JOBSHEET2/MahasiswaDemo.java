

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "2341760174";
        m1.nama = "Fakhira zahrany";
        m1.alamat = "Jl letjen S parman 2 no 18 Malang";
        m1.kelas = "SIB 2G";

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "2341760175";
        m2.nama = "Rian Surya";
        m2.alamat = "Jl Ijen 5 no 10 Malang";
        m2.kelas = "SIB 2H";
        m2.displayBiodata();

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "2341760175";
        m3.nama = "handina handoko";
        m3.alamat = "Jl Ijen 5 no 10 Malang";
        m3.kelas = "SIB 2H";
        m3.displayBiodata();

        m1.displayBiodata();
    }
}