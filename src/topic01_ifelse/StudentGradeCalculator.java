package topic01_ifelse;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner agung = new Scanner(System.in);

        System.out.println("Program Menghitung NIlai Akhir");
        System.out.println("=================================");
        System.out.print("Masukkan nilai Tugas: ");
        int tugas = agung.nextInt();
        System.out.print("Masukkan nilai Kuis: ");
        int kuis = agung.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int uts = agung.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int uas = agung.nextInt();
        System.out.println("=================================");
        
        double bobotTugas = 0.2;
        double bobotKuis = 0.2;
        double bobotUts = 0.3;
        double bobotUas = 0.4;

        double nilaiAkhir = 0;
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100 ) {
            
            System.out.println("nilai tidak valid.");
            System.out.println("=================================");
            return;
        }
        
        nilaiAkhir = (bobotTugas * tugas) + (bobotKuis * kuis) + (bobotUts * uts) + (bobotUas * uas);
        System.out.println("=================================");
        System.out.println("nilai akhir: " + nilaiAkhir);

        if (nilaiAkhir > 80) {
            System.out.println("Nilai Huruf A");
            System.out.println("=================================");
            System.out.println("=================================");
            System.out.println("SELAMAT ANDA LULUS");
            } else if (nilaiAkhir > 73) {
                System.out.println("Nilai Huruf B+");
                System.out.println("=================================");
                System.out.println("=================================");
                System.out.println("SELAMAT ANDA LULUS");
            } else if (nilaiAkhir > 65) {
                System.out.println("Nilai Huruf B");
                System.out.println("=================================");
                System.out.println("=================================");
                System.out.println("SELAMAT ANDA LULUS");
            } else if (nilaiAkhir > 60) {
                System.out.println("Nilai Huruf C+");
                System.out.println("=================================");
                System.out.println("=================================");
                System.out.println("SELAMAT ANDA LULUS");
            } else if (nilaiAkhir > 50) {
                System.out.println("Nilai Huruf C");
                System.out.println("=================================");
                System.out.println("=================================");
                System.out.println("SELAMAT ANDA LULUS");
            } else if (nilaiAkhir > 39) {
                System.out.println("Nilai Huruf D");
                System.out.println("=================================");
                System.out.println("=================================");
                System.out.println("SELAMAT ANDA LULUS");
            } else if (nilaiAkhir <= 39) {
                System.out.println("Nilai Huruf E");
                System.out.println("=================================");
                System.out.println("=================================");
                System.out.println("MAAF ANDA TIDAK LULUS");
            }


    }
}