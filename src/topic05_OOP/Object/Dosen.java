package topic05_OOP.Object;

public class Dosen {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen(String id, String nm, int thnBergabung, String bidang) {
        idDosen = id;
        nama = nm;
        tahunBergabung = thnBergabung;
        bidangKeahlian = bidang;
    }
    
    void tampilInformasi() {
        System.out.println("=".repeat(35));
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama Dosen      : " + nama);
        System.out.println("Status Dosen    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("-".repeat(35));
    }
    
    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi " + bidangKeahlian);
    }
}
