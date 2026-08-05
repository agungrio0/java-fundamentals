package topic05_OOP.Object;

public class mataKuliah {
    static String kodeMK;
    static String nama;
    static int sks;
    static int jumlahJam;

    public mataKuliah(String mk, String nm, int sks, int jam) {
        kodeMK = mk;
        nama = nm;
        this.sks = sks;
        jumlahJam = jam;
    }

    static void tampilInformasi() {
        System.out.println("=".repeat(40));
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mahasiswa   : " + nama);
        System.out.println("Jumlah SKS       : " + sks);
        System.out.println("Jumlah Jam       : " + jumlahJam);
        System.out.println("=".repeat(40));
    }

    static void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah dirubah.");
    }

    static void tambahJam(int updateJam) {
        jumlahJam += updateJam;
        System.out.println("Jumlah jam telah ditambah.");
    }

    static void kurangiJam(int updateJam) {
        if (jumlahJam < updateJam) {
            System.out.println("Pengurangan jam tidak dapat dilakukan.");
        } else {
            jumlahJam -= updateJam;
            System.out.println("Jumlah jam telah dikurangi");
        }
    }
}
