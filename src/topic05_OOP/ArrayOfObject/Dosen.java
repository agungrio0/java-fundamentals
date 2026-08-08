package topic05_OOP.ArrayOfObject;
import java.util.Scanner;

public class Dosen {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    void inputDosen(Scanner agung) {
        System.out.print("Kode                        : ");
        kode = agung.nextLine();
        System.out.print("Nama                        : ");
        nama = agung.nextLine();
        System.out.print("Jenis Kelamin (Pria/Wanita) : ");
        String jenis = agung.nextLine();
        if (jenis.equalsIgnoreCase("Wanita")) {
            jenisKelamin = false;
        } else {
            jenisKelamin = true;
        }
        System.out.print("Usia                        : ");
        usia = agung.nextInt();
        agung.nextLine();
        System.out.println("-".repeat(35));
    }
}
