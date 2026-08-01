package topic04_fungsi;
import java.util.Scanner;

public class StoreManagementSystem {
    static Scanner agung = new Scanner(System.in);

    static final int BATAS_RESTOK = 30;

    static String[] cabang = {
        "Nusantara Mart 1", "Nusantara Mart 2", "Nusantara Mart 3", "Nusantara Mart 4", "Nusantara Mart 5"
    };
    
    static String[] produk = {
        "Beras", "Gula", "Minyak", "Telur", "Susu"
    };

    static int[] harga = {
        77000, 18000, 22000, 24000, 10000
    };

    static int[][] stok = {
        {150, 80, 60, 70, 90},
        {120, 90, 50, 80, 75},
        {180, 70, 65, 90, 85},
        {140, 85, 55, 75, 95},
        {160, 95, 70, 85, 80}
    };

    static int[][] masuk = {
        {50, 20, 30, 20, 25},
        {30, 25, 20, 15, 20},
        {40, 15, 25, 20, 30},
        {35, 20, 20, 25, 20},
        {45, 30, 25, 15, 25}
    };

    static int[][] terjual = {
        {170, 60, 55, 65, 80},
        {110, 75, 45, 70, 65},
        {160, 55, 60, 75, 90},
        {150, 80, 50, 60, 85},
        {180, 85, 65, 80, 70}
    };


    static int stokAkhir(int baris, int kolom) {
        return stok[baris][kolom] + masuk[baris][kolom] - terjual[baris][kolom];
    }

    static int omzetProduk(int baris) {
        int omzet = 0;
        for (int i = 0; i < stok.length; i++) {
            omzet += harga[baris] * terjual[i][baris];
        }
        return omzet;
    }

    static int omzetCabang(int baris) {
        int omzet = 0;
        for (int i = 0; i < stok.length; i++) {
            omzet += harga[i] * terjual[baris][i];
        }
        return omzet;
    }

    static int omzetPerusahaan() {
        int omzet = 0;
        for (int i = 0; i < stok.length; i++) {
            omzet += omzetCabang(i);
        }
        return omzet;
    }

    static int[] terlaris() {
        int[] terlaris = new int[stok.length];

        for (int i = 0; i < stok.length; i++) {
            terlaris[i] = 0;
            for (int j = 0; j < stok[i].length; j++) {
                terlaris[i] += terjual[j][i];
            }
        }
        return terlaris;
    }

    static int[] terbesar() {
        int[] terbesar = new int[stok.length];

        for (int i = 0; i < stok.length; i++) {
            terbesar[i] = 0;
            for (int j = 0; j < stok[i].length; j++) {
                terbesar[i] += harga[i] * terjual[j][i];
            }
        }
        return terbesar;
    }

    static int[] analisisProduk() {
        int[] hasilTerlaris = terlaris();
        int[] hasilTerbesar = terbesar();
        int terlaris = 0;
        int terbesar = 0;
        int indexTerlaris = 0;
        int indexTerbesar = 0;

        for (int i = 0; i < hasilTerbesar.length; i++) {
            if (hasilTerlaris[i] > terlaris) {
                terlaris = hasilTerlaris[i];
                indexTerlaris = i;
            }
    
            if (hasilTerbesar[i] > terbesar) {
                terbesar = hasilTerbesar[i];
                indexTerbesar = i;
            }
        }
        
        return new int[] {terlaris, indexTerlaris, terbesar, indexTerbesar};
    }

    static void restok() {
        System.out.println("Perlu Restok : ");
        System.out.println("");
        for (int i = 0; i < stok.length; i++) {
            System.out.printf("%-18s %-5s", cabang[i], "-->");
            for (int j = 0; j < stok[i].length; j++) {
                if (stokAkhir(i, j) < BATAS_RESTOK) {
                    System.out.print(produk[j]);
                    System.out.print(", ");
                }
            }
            System.out.println("");
        }
    }

    static int[] analisisCabang() {
        int omzetCabang = omzetCabang(0);

        int cabangTerbaik = omzetCabang;
        int cabangTerburuk = omzetCabang;
        int indexTerbaik = 0;
        int indexTerburuk = 0;

        for (int i = 0; i < stok.length; i++) {
            int dataCabang = omzetCabang(i);
            if (dataCabang > cabangTerbaik) {
                cabangTerbaik = dataCabang;
                indexTerbaik = i;
            }
            if (dataCabang < cabangTerburuk) {
                cabangTerburuk = dataCabang;
                indexTerburuk = i;
            }
        }

        return new int[] {cabangTerbaik, indexTerbaik, cabangTerburuk, indexTerburuk};
    }

    static int[] statistik() {
        int stokAwal = 0;
        int barangMasuk = 0;
        int barangKeluar = 0;
        int stokAkhir = 0;
        int totalOmzet = omzetPerusahaan();
        int rataRata = totalOmzet / cabang.length;

        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                stokAwal += stok[i][j];
                barangMasuk += masuk[i][j];
                barangKeluar += terjual[i][j];
                stokAkhir += stokAkhir(i, j); 
            }
        }

        return new int[] {stokAwal, barangMasuk, barangKeluar, stokAkhir, totalOmzet, rataRata};
    }

    public static void main(String[] args) {
        int menu;
        do {
            System.out.println("1. Informasi Seluruh Cabang");
            System.out.println("2. Laporan Omzet");
            System.out.println("3. Analisis Produk");
            System.out.println("4. Analisis Cabang");
            System.out.println("5. Statistik Perusahaan");
            System.out.println("0. Exit");
            System.out.print("Masukkan Menu : ");
            menu = agung.nextInt();

            if (menu == 1) {
                for (int i = 0; i < stok.length; i++) {
                    System.out.println("=".repeat(30) + " " + cabang[i] + " " + "=".repeat(30));
                    System.out.printf("%-12s %-12s %-12s %-12s %-12s %-12s\n", "Produk", "Harga", "Stok", "Masuk", "Terjual", "Stok Akhir");
                    System.out.println("-".repeat(78));
                    for (int j = 0; j < stok[i].length; j++) {
                        System.out.printf("%-12s %-12d %-12d %-12d %-12d %-12d\n", produk[j], harga[j], stok[i][j], masuk[i][j], terjual[i][j], stokAkhir(i,j));
                    }
                    System.out.println("=".repeat(78));
                    System.out.println("");
                }
            } else if (menu == 2) {
                System.out.println("=".repeat(30));
                System.out.println(" ".repeat(8) + "Omzet Produk" + " ".repeat(8));
                System.out.println("");
                for (int i = 0; i < stok.length; i++) {
                    int hasil = omzetProduk(i);
                    System.out.printf("%-10s %-1s %-10d\n", produk[i], ":", hasil);
                }
                System.out.println("-".repeat(30));
                System.out.println(" ".repeat(8) + "Omzet Cabang" + " ".repeat(8));
                System.out.println("");
                for (int i = 0; i < stok.length; i++) {
                    int hasil = omzetCabang(i);
                    System.out.printf("%-15s %-1s %-10d\n", cabang[i], ":", hasil);
                }
                System.out.println("-".repeat(30));
                System.out.println("Total Omzet Perusahaan:");
                System.out.println("");
                System.out.println(omzetPerusahaan());
                System.out.println("=".repeat(30));
                System.out.println("");
            } else if (menu == 3) {
                int[] hasil = analisisProduk();

                System.out.println("=".repeat(45));
                System.out.println("Produk Terlaris : " + produk[hasil[1]]);
                System.out.println("Total Terjual   : " + hasil[0]);
                System.out.println("-".repeat(45));
                System.out.println("Omzet Terbesar : " + produk[hasil[3]]);
                System.out.println("Total Omzet : " + hasil[2]);
                System.out.println("-".repeat(45));
                restok();
                System.out.println("=".repeat(45));
                System.out.println("");
            } else if (menu == 4) {
                System.out.println("=".repeat(35));
                for (int i = 0; i < stok.length; i++) {
                    int hasil = omzetCabang(i);
                    System.out.printf("%-15s %-1s %-10d\n", cabang[i], ":", hasil);
                }
                System.out.println("-".repeat(35));
                
                int[] hasilAnalisisCabang = analisisCabang();
                System.out.println("Cabang Terbaik   : " + cabang[hasilAnalisisCabang[1]]);
                System.out.println("Total Omzet      : " + hasilAnalisisCabang[0]);
                System.out.println("-".repeat(35));
                System.out.println("Cabang Terburuk  : " + cabang[hasilAnalisisCabang[3]]);
                System.out.println("Total Omzet      : " + hasilAnalisisCabang[2]);
                System.out.println("=".repeat(35));
                System.out.println("");
            } else if (menu == 5) {
                int[] hasil = statistik();

                System.out.println("=".repeat(30));
                System.out.println("Total Stok Awal     : " + hasil[0]);
                System.out.println("-".repeat(30));
                System.out.println("Total Barang Masuk  : " + hasil[1]);
                System.out.println("-".repeat(30));
                System.out.println("Total Barang Keluar : " + hasil[2]);
                System.out.println("-".repeat(30));
                System.out.println("Total Stok Akhir    : " + hasil[3]);
                System.out.println("-".repeat(30));
                System.out.println("Total Omzet         : Rp." + hasil[4]);
                System.out.println("-".repeat(30));
                System.out.println("Rata-rata Omzet     : Rp." + hasil[5]);
                System.out.println("=".repeat(30));
            }
        } while (menu != 0);
    }
}
