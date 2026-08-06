package topic05_OOP.ArrayOfObject;
import java.util.Scanner;

public class Mahasiswa {
    String nim;
    String nama;
    String kelas;
    float ipk;

    void tampilInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("-".repeat(20));
    }

    void tambahData(Scanner agung) {
        System.out.print("Nama  : ");
        nama = agung.nextLine();
        System.out.print("NIM   : ");
        nim = agung.nextLine();
        System.out.print("Kelas : ");
        kelas = agung.nextLine();
        System.out.print("IPK   : ");
        ipk = agung.nextFloat();
        agung.nextLine();
    }
}
