package topic04_fungsi;
import java.util.Scanner;

public class SmartCashierSystem {
    static Scanner agung = new Scanner(System.in);

    static String[] barang = {
        "Beras", "Susu", "Minyak", "Telur", "Kopi", "Teh"
    };

    static int[] harga = {
        73000, 45000, 18000, 25000, 15000, 12000
    };

    static int[] jumlah = new int[6];

    static void input() {
        for (int i = 0; i < barang.length; i++) {
            jumlah[i] = 0;
            System.out.print("Masukkan jumlah " + barang[i] + ": ");
            jumlah[i] = agung.nextInt();
        }
        System.out.println("=".repeat(40));
    }

    static int hitung(int baris) {
        return harga[baris] * jumlah[baris];
    }

    static void info() {
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Barang", "Harga", "Jumlah" , "Total");
        for (int i = 0; i < barang.length; i++) {
            System.out.printf("%-10s %-10d %-10d %-10d\n", barang[i], harga[i], jumlah[i], hitung(i));
        }
        System.out.println("-".repeat(40));
    }

    static int totalBelanja() {
        int total = 0;
        for (int i = 0; i < barang.length; i++) {
            total += hitung(i);
        }
        return total;
    }

    static double diskonBelanja() {
        int total = totalBelanja();
        if (total > 500000) {
            return 0.1 * total;
        } else {
            return 0 * total;
        }
    }

    static double pajak() {
        double total = totalBelanja() - diskonBelanja();
        return 0.11 * total;
    }

    static double totalBayar() {
        int total = totalBelanja();
        double diskon = total - diskonBelanja();
        return diskon + pajak();
    }

    static void status() {
        System.out.println("Total Belanja : " + totalBelanja());
        System.out.println("Diskon        : " + diskonBelanja());
        System.out.println("PPN           : " + pajak());
        System.out.println("-".repeat(40));
        System.out.println("Total Bayar   : " + totalBayar());
        System.out.println("=".repeat(40));
    }
    public static void main(String[] args) {
        input();
        info();
        status();
    }
}
