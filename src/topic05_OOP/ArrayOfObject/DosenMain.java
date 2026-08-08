package topic05_OOP.ArrayOfObject;
import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner agung = new Scanner(System.in);

        Dosen[] d = new Dosen[3];
        for (int i = 0; i < d.length; i++) {
            System.out.println("Masukkan Data Dosen Ke-" + (i + 1));
            d[i] = new Dosen();
            d[i].inputDosen(agung);
        }

        DataDosen data = new DataDosen();
        System.out.println("=".repeat(35));
        data.dataSemuaDosen(d);

        int[] hasil = data.jumlahDosenPerJenisKelamin(d);
        int[] hasil2 = data.rerataUsiaDosenPerJenisKelamin(d);
        System.out.println("Jumlah Dosen Pria        : " + hasil[0]);
        System.out.println("Jumlah Dosen Wanita      : " + hasil[1]);
        System.out.println("Rerata Usia Dosen Pria   : " + hasil2[0]);
        System.out.println("Rerata Usia Dosen Wanita : " + hasil2[1]);
        System.out.println("Dosen Paling Tua         : " + data.infoDosenPalingTua(d));
        System.out.println("Dosen Paling Muda        : " + data.infoDosenPalingMuda(d));
        System.out.println("=".repeat(25));
    }
}
