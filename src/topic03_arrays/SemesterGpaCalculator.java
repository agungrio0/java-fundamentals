package topic03_arrays;

import java.util.Scanner;

public class SemesterGpaCalculator {
    public static void main(String[] args) {
        Scanner agung = new Scanner(System.in);

        String[] mk = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
            "Matematika Dasar", "Bahas Inggris", "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {
            2, 2, 2, 3, 2, 2, 3, 2
        }; 

        double[] nilai = new double[8];
        String[] huruf = new String[8];
        double[] setara = new double[8];

        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");

        double totalNilai = 0;
        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mk[i] + ": ");
            nilai[i] = agung.nextInt();

                if (nilai[i] > 80) {
                    huruf[i] = "A";
                    setara[i] = 4;
                } else if (nilai[i] > 73) {
                    huruf[i] = "B+";
                    setara[i] = 3.5;
                } else if (nilai[i] > 65) {
                    huruf[i] = "B";
                    setara[i] = 3;
                } else if (nilai[i] > 60) {
                    huruf[i] = "C+";
                    setara[i] = 2.5;
                } else if (nilai[i] > 50) {
                    huruf[i] = "C";
                    setara[i] = 2;
                } else if (nilai[i] > 39) {
                    huruf[i] = "D";
                    setara[i] = 1;
                } else {
                    huruf[i] = "E";
                    setara[i] = 0;
                }

            totalNilai += (setara[i] * sks[i]);

        }

        double totalSKS = 0;
        for (int i = 0; i < sks.length; i++) {
            totalSKS += sks[i];
        }

        double IP = totalNilai / totalSKS;

        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");
        System.out.printf("%-40s %-20s %-20s %-20s\n", 
            "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < mk.length; i++) {
                System.out.printf(
                    "%-40s %-20.2f %-20s %-20.2f\n",
                    mk[i], nilai[i], huruf[i], setara[i]
                );
        }

        System.out.println("======================");
        System.out.printf("IP : %.2f" , IP);
    }
}
