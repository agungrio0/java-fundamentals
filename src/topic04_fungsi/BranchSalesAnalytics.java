package topic04_fungsi;

public class BranchSalesAnalytics {
    static int[] pendapatan = {
        18250000, 15400000, 22100000, 17350000, 20800000
    };

    static String[] cabang = {
        "Cabang 1", "Cabang 2", "Cabang 3", "Cabang 4", "Cabang 5"
    };

    static int hitung() {
        int total = 0;
        for (int i = 0; i < pendapatan.length; i++) {
            total += pendapatan[i];
        }
        return total;
    }
    
    static double rataRata() {
        return (double)hitung() / pendapatan.length;
    }

    static String[] minMax() {
        int tertinggi = pendapatan[0];
        int terendah = pendapatan[0];
        String cabangTertinggi = cabang[0];
        String cabangTerendah = cabang[0];
        for (int i = 0; i < pendapatan.length; i++) {
            if (pendapatan[i] > tertinggi) {
                tertinggi = pendapatan[i];
                cabangTertinggi = cabang[i];
            }
            if (pendapatan[i] < terendah) {
                terendah = pendapatan[i];
                cabangTerendah = cabang[i];
            }
        }
        return new String[]{cabangTertinggi,cabangTerendah};
    }

    static void rangking() {
        int[] copyPendapatan = new int[pendapatan.length];
        int temp = 0;
        String wadah = cabang[0];
        for (int i = 0; i < cabang.length; i++) {
             int terbesar = 0;
             for (int j = 0; j < cabang.length; j++) {
                 if (copyPendapatan[j] > terbesar) {
                     terbesar = copyPendapatan[j];
                     wadah = cabang[j];
                     temp = j;
                 }
             }
             System.out.println(wadah);
             copyPendapatan[temp] = -1;
        }
        // int wadahPendapatan;
        // String wadah;
        // for (int i = 0; i < cabang.length; i++) {
        //     for (int j = 1; j < (cabang.length - i); j++) {
        //         if (pendapatan[j-1] < pendapatan[j]) {
        //             wadahPendapatan = pendapatan[j-1];
        //             pendapatan[j-1] = pendapatan[j];
        //             pendapatan[j] = wadahPendapatan;

        //             wadah = cabang[j-1];
        //             cabang[j-1] = cabang[j];
        //             cabang[j] = wadah;
        //         }
        //     }
        // }
    }

    static void info() {
        System.out.println("=".repeat(25));
        System.out.println("BRANCH SALES ANALYTICS");
        System.out.println("=".repeat(25));
        System.out.printf("%-10s %-10s\n", "Cabang", "Pendapatan");
        System.out.println("-".repeat(35));
        for (int i = 0; i < cabang.length; i++) {
            System.out.printf("%-10s %-10d\n", cabang[i], pendapatan[i]);
        }
        System.out.println("-".repeat(35));
    }

    static void status() {
        String[] maxMin = minMax();

        System.out.println("Rata-rata Pendapatan : " + rataRata());
        System.out.println("");
        System.out.println("Pendapatan Tertinggi : " + maxMin[0]);
        System.out.println("Pendapatan Terendah  : " + maxMin[1]);
        System.out.println("");
        System.out.println("Rangking : ");
        rangking();
        // rangking();
        // for (int i = 0; i < cabang.length; i++) {
        //     System.out.println(cabang[i]);
        // }
        // System.out.println("=".repeat(35));
    }

    public static void main(String[] args) {
        info();
        status();
    }
}
