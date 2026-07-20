package topic04_fungsi;
import java.util.Scanner;
public class CinemaManagementSystem {
    static Scanner agung = new Scanner(System.in);

    static String[] studio = {
        "Reguler", "Premium", "IMAX", "VIP"
    };

    static int[] harga = {
        45000, 60000, 75000, 90000
    };

    static int[] kapasitas = {
        210, 180, 150, 100
    };

    static int[] terjual = {
        200, 150, 125, 20
    };

    static void info() {
        System.out.println("=".repeat(50));
        System.out.printf("%-12s %-13s %-10s %-10s\n", "Studio", "Kapasitas", "Terjual", "Harga");
        System.out.println("-".repeat(50));
        for (int i = 0; i < studio.length; i++) {
            System.out.printf("%-12s %-13d %-10d %-10d\n", studio[i], kapasitas[i], terjual[i], harga[i]);
        }
        System.out.println("=".repeat(50));
    }

    static int pendapatan(int baris) {
        return harga[baris] * terjual[baris];
    }

    static int kursiKosong(int baris) {
        return kapasitas[baris] - terjual[baris];
    }

    static int persentase(int baris) {
        return 100 * terjual[baris] / kapasitas[baris];
    }

    static int[] terbaik() {
        int terbaik = 0;
        int terisi = 0;
        int persen = 0;
        int index = 0;

        for (int i = 0; i < studio.length; i++) {
            int hasil = pendapatan(i);
            if (hasil > terbaik) {
                index = i;
                terbaik = hasil;
                terisi = terjual[i];
                persen = persentase(i);
            }
        }
        return new int[]{index, terbaik, terisi, persen};
    }

    static int[] statistik() {
        int totalKapasitas = 0;
        int totalTerjual = 0;
        int totalKosong = 0;
        int totalPendapatan = 0;
        int okupansiBioskop = 0;

        for (int i = 0; i < studio.length; i++) {
            totalKapasitas += kapasitas[i];
            totalTerjual += terjual[i];
            totalKosong += kursiKosong(i);
            totalPendapatan += pendapatan(i);
        }
        okupansiBioskop = 100 * totalTerjual / totalKapasitas;

        return new int[]{totalKapasitas, totalTerjual, totalKosong, totalPendapatan, okupansiBioskop};
    }

    static String status(int baris) {
        int persen = persentase(baris);
        if (persen >= 90) {
            return "Hampir Penuh";
        } else if (persen >= 70) {
            return "Ramai";
        } else if (persen >= 40) {
            return "Normal";
        }

        return "Sepi";
    }
    public static void main(String[] args) {
        int menu;

        do {
            System.out.print("=".repeat(20));
            System.out.print(" CINEMA MANAGEMENT ");
            System.out.println("=".repeat(20));
            System.out.println("1. Informasi Studio");
            System.out.println("2. Laporan Pendapatan");
            System.out.println("3. Studio Terbaik");
            System.out.println("4. Statistik");
            System.out.println("5. Status Studio");
            System.out.println("0. Exit");
            System.out.print("Pilih Menu : ");
            menu = agung.nextInt();

            if (menu == 1) {
                info();
            } else if (menu == 2) {
                System.out.println("=".repeat(50));
                for (int i = 0; i < studio.length; i++) {
                    System.out.printf("%-7s %-1s %-10d\n", studio[i], ":", pendapatan(i));
                }
                System.out.println("=".repeat(50));
            } else if (menu == 3) {
                int[] infoTerbaik = terbaik();
                System.out.println("=".repeat(50));
                System.out.println("Studio Terbaik");
                System.out.println("-".repeat(25));
                System.out.println("Studio " + studio[infoTerbaik[0]]);
                System.out.println("Pendapatan : " + infoTerbaik[1]);
                System.out.println("Terjual    : " + infoTerbaik[2]);
                System.out.println("Okupansi   : " + infoTerbaik[3] + "%");
                System.out.println("=".repeat(50));
            } else if (menu == 4) {
                int[] hasil = statistik();
                System.out.println("=".repeat(50));
                System.out.println("Total Kapasitas     : " + hasil[0]);
                System.out.println("Total Tiket Terjual : " + hasil[1]);
                System.out.println("Total Kursi Kosong  : " + hasil[2]);
                System.out.println("Total Pendapatan    : " + hasil[3]);
                System.out.println("Persentase Okupansi : " + hasil[4] + "%");
                System.out.println("=".repeat(50));
            } else if (menu == 5) {
                System.out.println("=".repeat(50));
                for (int i = 0; i < studio.length; i++) {
                    System.out.printf("%-1s %-8s %-1s %-10s\n", "Studio", studio[i], ":", status(i));
                }
                System.out.println("=".repeat(50));
            }
        } while (menu != 0);
    }
    
}
