package topic01_ifelse;

import java.util.Scanner;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner agung = new Scanner(System.in);

        System.out.println("Program Menghitung Gaji Karyawan");
        System.out.println("================================");
        System.out.print("Masukkan nama         : ");
        String nama = agung.nextLine();
        System.out.print("Masukkan jam kerja    : ");
        int jamKerja = agung.nextInt();
        System.out.print("Masukkan upah per jam : ");
        double upahPerJam = agung.nextDouble();
        System.out.print("Masukkan status (1/2) : ");
        int status = agung.nextInt();
        System.out.println("================================");

        if ((jamKerja < 1 || jamKerja > 80) ||
            (upahPerJam <= 0) ||
            (status != 1 && status != 2)) {
            System.out.println("Input tidak valid.");
            return;
        } 
        
        double upahLembur = 0;
        double gajiPokok = 0;
        if (jamKerja > 40) {
            upahLembur = (jamKerja - 40) * upahPerJam * 1.5;
            gajiPokok = (jamKerja - jamKerja + 40) * upahPerJam;
        } else {
            gajiPokok = jamKerja * upahPerJam;
        }

        double bonus = 0;
        if (status == 1) {
            bonus = 500000;
        } else if (status == 2) {
            bonus = 200000;
        }

        double totalGaji = gajiPokok + bonus + upahLembur;

        double pajak;
        double totalPajak;
        if (totalGaji > 5000000) {
            pajak = 0.10;
            totalPajak = totalGaji * pajak;
        } else {
            pajak = 0.05;
            totalPajak = totalGaji * pajak;
        }

        double gajiBersih = totalGaji - totalPajak;

        System.out.println("Nama        : " + nama);
        System.out.println("Gaji Pokok  : " + gajiPokok);
        System.out.println("Upah Lembur : " + upahLembur);
        System.out.println("Bonus       : " + bonus);
        System.out.println("Total Gaji  : " + totalGaji);
        System.out.println("Pajak       : " + totalPajak);
        System.out.println("Gaji Bersih : " + gajiBersih);
    }
}
