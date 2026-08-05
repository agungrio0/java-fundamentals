package topic05_OOP.Object;
import java.util.Scanner;

public class Kendaraan {
    Scanner agung = new Scanner(System.in);

    String kodeKendaraan;
    String namaKendaraan;
    String jenisKendaraan;
    int tarifSewaPerHari;
    boolean statusDisewa;

    public Kendaraan(String kode, String nama, String jenis, int tarif, boolean status) {
        kodeKendaraan = kode;
        namaKendaraan = nama;
        jenisKendaraan = jenis;
        tarifSewaPerHari = tarif;
        statusDisewa = status;
    }

    void tampilInformasi() {
        System.out.println("=".repeat(45));
        System.out.println("Kode Kendaraan : " + kodeKendaraan);
        System.out.println("Nama           : " + namaKendaraan);
        System.out.println("Jenis          : " + jenisKendaraan);
        System.out.println("Tarif/Hari     : " + tarifSewaPerHari);
        System.out.println("Status         : " + (statusDisewa ? "Tersedia" : "Disewa"));
        System.out.println("=".repeat(45));
    }

    void sewaKendaraan(boolean status) {
        if (statusDisewa == true) {
            statusDisewa = status;
            System.out.print("Masukkan jumlah berapa hari sewa: ");
            int jumlah = agung.nextInt();
            System.out.println("");

            tampilInformasi();
            System.out.println("Jumlah Biaya sewa : " + hitungBiayaSewa(jumlah));
        } else {
            System.out.println("");
            System.out.println("Kendaraan " + namaKendaraan + " sudah disewakan");
        }
        System.out.println("");
    }

    void kembalikanKendaraan() {
        if (statusDisewa == false) {
            statusDisewa = true;
            System.out.println("Kendaraan " + namaKendaraan + " sudah dikembalikan");
            tampilInformasi();
        } else {
            System.out.println("Kendaraan " + namaKendaraan + " sedang tidak disewa");
        }
        System.out.println("");
    }

    int hitungBiayaSewa(int jumlahHari) {
        return tarifSewaPerHari * jumlahHari;
    }

    void ubahTarif(int tarifBaru) {
        tarifSewaPerHari = tarifBaru;
        System.out.println("TARIF SUDAH DIRUBAH");
        tampilInformasi();
    }
}
