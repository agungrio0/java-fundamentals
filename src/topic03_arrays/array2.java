package topic03_arrays;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner agung = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("SISTEM PENILAIAN TOKO");
        System.out.println("===========================");

        String[] produk = {
            "Beras", "Gula", "Minyak", "Telur", "Mie Instan", "Kopi", "Teh", "Susu"
        };

        int[] harga = new int[8];
        int[] jumlah = new int[8];
        int[] subtotal = new int[8];

        int totalBelanja = 0;
        int totalJumlah = 0;
        for (int i = 0; i < produk.length; i++) {
            System.out.print("Masukkan harga " + produk[i] + ": ");
            harga[i] = agung.nextInt();
            System.out.print("Masukkan jumlah " + produk[i] + ": ");
            jumlah[i] = agung.nextInt();
            System.out.println("-----------------------");
            
            // if (harga[i] < terendah) {
            //     terendah = harga[i];
            // }
            // if (harga[i] > tertinggi) {
            //     tertinggi = harga[i];
            // }   

            subtotal[i] = harga[i] * jumlah[i];
            totalBelanja += subtotal[i];
            totalJumlah += jumlah[i];

        }

        System.out.printf("%-15s %-10s %-10s %-10s\n", 
        "Produk", "Harga", "Jumlah", "Subtotal");
        System.out.println("-".repeat(50));

        for (int i = 0; i < produk.length; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d\n",
                produk[i], harga[i], jumlah[i], subtotal[i]);
            }

        System.out.println("-".repeat(50));
        System.out.printf("%29d %19d\n",
            totalJumlah, totalBelanja);

        int tertinggi = harga[0];
        int terendah = harga[0];
        String produkTertinggi = produk[0];
        String produkTerendah = produk[0];
        for (int i = 1; i < produk.length; i++) {
            if (harga[i] < terendah) {
                terendah = harga[i];
                produkTerendah = produk[i];
            }
            if (harga[i] > tertinggi) {
                tertinggi = harga[i];
                produkTertinggi = produk[i];
            }
        }

        System.out.println("Harga Tertinggi : " + produkTertinggi);
        System.out.println("Harga Terendah  : " + produkTerendah);
        System.out.println("=".repeat(50));

        double diskon;

        System.out.println("Total       : " + totalBelanja);
        if (totalBelanja >= 300000) {
            System.out.println("Diskon      : 15%");
            diskon = 0.15 * totalBelanja;
        } else if (totalBelanja >= 200000) {
            System.out.println("Diskon      : 10%");
            diskon = 0.10 * totalBelanja;
        } else if (totalBelanja >= 100000) {
            System.out.println("Diskon      : 5%");
            diskon = 0.05 * totalBelanja;
        } else {
            System.out.println("Diskon      : 0%");
            diskon = 0 * totalBelanja;
        }

        double totalBayar = totalBelanja - diskon;

        System.out.println("Total Bayar : " + totalBayar);




        



    }
}
