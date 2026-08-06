package topic05_OOP.ArrayOfObject;
import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
       Scanner agung = new Scanner(System.in);
       Mahasiswa[] mhs = new Mahasiswa[3];

       for (int i = 0; i < mhs.length; i++) {
           mhs[i] = new Mahasiswa();

           System.out.println("Masukkan Data Mahasiswa Ke-" + (i + 1));
           System.out.print("Nama  : ");
           mhs[i].nama = agung.nextLine();
           System.out.print("NIM   : ");
           mhs[i].nim = agung.nextLine();
           System.out.print("Kelas : ");
           mhs[i].kelas = agung.nextLine();
           System.out.print("IPK   : ");
           mhs[i].ipk = agung.nextFloat();
           agung.nextLine();
       }

       String tambah;
       System.out.print("Apakah Anda ingin tambah data Mahasiswa? (Ya/Tidak): ");
       tambah = agung.nextLine();
       if (tambah.equalsIgnoreCase("ya")) {
          System.out.print("Masukkan jumlah data Mahasiswa Baru : ");
          int jumlah = agung.nextInt();
          agung.nextLine();

          Mahasiswa[] baru = new Mahasiswa[mhs.length + jumlah];

          for (int i = 0; i < mhs.length; i++) {
            baru[i] = mhs[i];
          }
          
          for (int i = mhs.length; i < baru.length; i++) {
            baru[i] = new Mahasiswa();
            System.out.println("Masukkan Data Mahasiswa Baru");
            baru[i].tambahData(agung);
          }

          mhs = baru;
       }

        System.out.println("=".repeat(35));
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("=== IDENTITAS MAHASISWA KE-" + (i + 1) + " ===" );
            mhs[i].tampilInformasi();
        }
    }
}
