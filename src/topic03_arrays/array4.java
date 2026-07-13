package topic03_arrays;

import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner agung = new Scanner(System.in);

        String[] mutasi = new String[50];
        int nilai;
        int jumlah = 0;

        int saldo = 500000;

        for (int i = 0; i < mutasi.length; i++) {
            System.out.println("=".repeat(20));
            System.out.println("ATM MINI");
            System.out.println("=".repeat(20));
            System.out.println("Menu");
            System.out.println("1. Setor Tunai");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Lihat Mutasi Rekening");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int menu = agung.nextInt();

            if (menu == 1) {
                System.out.println("");
                System.out.println("Saldo anda Rp. " + saldo);
                System.out.println("-".repeat(60));
                System.out.print("Masukkan nominal yang ingin anda setor: Rp. ");
                nilai = agung.nextInt();

                if (nilai <= 0) {
                    System.out.println("Nominal yang Anda masukkan tidak valid!");
                } else {
                    saldo += nilai;
                    System.out.println("Saldo Anda bertambah menjadi Rp. " + saldo);
                    System.out.println("-".repeat(60));
    
                    mutasi[jumlah] = "Anda telah melakukan (Setor Tunai) sebesar Rp. " + nilai;
                    jumlah++;
                }
            } else if (menu == 2) {
                System.out.println("");
                System.out.println("Saldo Anda Rp. " + saldo);
                System.out.println("-".repeat(60));
                System.out.print("Masukkan nominal yang ingin Anda tarik: Rp. ");
                nilai = agung.nextInt();

                if (nilai <= 0) {
                    System.out.println("Nominal yang Anda masukkan tidak valid!");
                } else {
                    if (nilai > saldo) {
                        System.out.println("Saldo Anda tidak mencukupi!");
                    } else {
                        saldo -= nilai;
                        System.out.println("Saldo Anda berkurang menjadi Rp. " + saldo);
                        System.out.println("-".repeat(60));
    
                        mutasi[jumlah] = "Anda telah melakukan (Tarik Tunai) sebesar Rp. -" + nilai;
                        jumlah++;
                    }
                }
            } else if (menu == 3) {
                System.out.println("");
                for (int j = 0; j < jumlah; j++) {
                    System.out.println(mutasi[j]);
                    System.out.println("-".repeat(60));
                }
            } else if (menu == 4) {
                return;
            } else {
                System.out.println("Pilihan Menu tidak valid!");
            }
        }
    }
}
