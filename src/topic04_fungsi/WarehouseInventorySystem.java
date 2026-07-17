package topic04_fungsi;
import java.util.Scanner;

public class WarehouseInventorySystem {
    static Scanner agung = new Scanner(System.in);

    static String[] produk = {
        "Keyboard", "Mouse", "Monitor", "Headset"
    };

    static int[] stok = {
        20, 35, 8, 12
    };

    static int[] terjual = {
        50, 80, 25, 60
    };

    static int[] harga = {
        250000, 100000, 1500000, 80000
    };

    static int hitung(int baris) {
        return terjual[baris] * harga[baris];
    }

    static void info() {
        System.out.println("=".repeat(25));
        System.out.println("WAREHOUSE INVENTORY");
        System.out.println("=".repeat(25));
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Produk", "Stok", "Terjual", "Pendapatan");
        for (int i = 0; i < produk.length; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d\n", produk[i], stok[i], terjual[i], hitung(i));
        }
        System.out.println("-".repeat(50));
    }

    static String produkTerlaris() {
        int terlaris = terjual[0];
        String barang = produk[0];
        for (int i = 0; i < produk.length; i++) {
            if (terjual[i] > terlaris) {
                terlaris = terjual[i];
                barang = produk[i];
            }
        }
        return barang;
    }

    static String pendapatanTerbesar() {
        int terbesar = hitung(0);
        String barang = produk[0];
        for (int i = 0; i < produk.length; i++) {
            int omzet = hitung(i);
            if (omzet > terbesar) {
                terbesar = omzet;
                barang = produk[i];
            }
        }
        return barang;
    }

    static String[] stokMinMax() {
        int stokBanyak = stok[0];
        int stokDikit = stok[0];
        String barangBanyak = produk[0];
        String barangDikit = produk[0];
        for (int i = 0; i < harga.length; i++) {
            if (stok[i] > stokBanyak) {
                stokBanyak = stok[i];
                barangBanyak = produk[i];
            }

            if (stok[i] < stokDikit) {
                stokDikit = stok[i];
                barangDikit = produk[i];
            }
        }
        return new String[]{barangBanyak,barangDikit};
    }

    static void restok() {
        String barang;
        System.out.println("Butuh Restok");
        System.out.println("-".repeat(30));
        for (int i = 0; i < stok.length; i++) {
            if (stok[i] < 10) {
                barang = produk[i];
                System.out.println(barang);
            }
        }
        System.out.println("=".repeat(50));
    }

    static void status() {
        String[] minMax = stokMinMax();

        System.out.println("Produk Terlaris     : " + produkTerlaris());
        System.out.println("Omzet Terbesar      : " + pendapatanTerbesar());
        System.out.println("Stok Paling Banyak  : " + minMax[0]);
        System.out.println("Stok Paling Sedikit : " + minMax[1]);
        System.out.println("");
    }
    public static void main(String[] args) {
        info();
        status();
        restok();

    }
}
