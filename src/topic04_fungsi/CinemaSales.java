package topic04_fungsi;

public class CinemaSales {
    static String[] jenisStudio = {
        "Reguler", "Premium", "IMAX", "VIP" 
    };

    static int[] hargaTiket = {
        45000, 60000, 75000, 90000
    };

    static int[][] jumlahTiket = {
        {90, 86, 50, 40},
        {77, 64, 40, 33},
        {60, 50, 35, 20},
        {74, 55, 20, 10}
    };

    static void info() {
        System.out.printf("%-10s", "");
        for (int i = 0; i < jenisStudio.length; i++) {
            System.out.printf("%-10s", jenisStudio[i]);
        }
        System.out.println("");

        for (int i = 0; i < jenisStudio.length; i++) {
            System.out.print("Studio " + (i + 1));
            System.out.printf("%-2s", "");
            for (int j = 0; j < jumlahTiket[i].length; j++) {
                System.out.printf("%-10d", jumlahTiket[i][j]);
            }
            System.out.println("");
        }
    }

    static int hitung(int baris) {
        int total = 0;
        for (int i = 0; i < jumlahTiket[baris].length; i++) {
            total += (hargaTiket[i] * jumlahTiket[baris][i]);
        }
        return total;
    }

    static void totalPerCabang() {
        for (int i = 0; i < jenisStudio.length; i++) {
            System.out.println("Total Cabang " + (i + 1) + " : " + hitung(i));
        }
    }

    static void totalPendapatan() {
        int total = 0;
        for (int i = 0; i < jenisStudio.length; i++) {
            total += hitung(i);
        }
        System.out.println("Total pendapatan seluruh cabang adalah : " + total);
    }

    static void status() {
        for (int i = 0; i < hargaTiket.length; i++) {
            if (hitung(i) >= 15000000) {
                System.out.println("Cabang Studio " + (i + 1) + " mencapai target");
            } else {
                System.out.println("Cabang Studio " + (i + 1) + " masih perlu promosi");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        info();
        System.out.println("-".repeat(60));
        totalPerCabang();
        System.out.println("-".repeat(60));
        totalPendapatan();
        System.out.println("-".repeat(60));
        status();
        System.out.println("=".repeat(60));
    }
   

}
