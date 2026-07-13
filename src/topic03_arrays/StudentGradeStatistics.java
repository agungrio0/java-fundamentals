package topic03_arrays;

public class StudentGradeStatistics {
    public static void main(String[] args) {
        
        String[] nama = {
            "Andi", "Budi", "Chelsi", "Nadya", "Robi", "Calya", "Zakaria", "Raysha", "Rendi", "Agung"
        };

        int[] nilai = {
            64, 76, 81, 66, 56, 36, 40, 80, 74, 90
        };

        String[] huruf = new String[10];
        int[] totalHuruf = new int[7];

        System.out.println("=".repeat(20));
        System.out.println("RANKING MAHASISWA");
        System.out.println("=".repeat(20));
        
        int jumlahHuruf = 1;
        double rata = 0;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > 80) {
                    huruf[i] = "A";
                    totalHuruf[0] += jumlahHuruf;
                } else if (nilai[i] > 73) {
                    huruf[i] = "B+";
                    totalHuruf[1] += jumlahHuruf;
                } else if (nilai[i] > 65) {
                    huruf[i] = "B";
                    totalHuruf[2] += jumlahHuruf;
                } else if (nilai[i] > 60) {
                    huruf[i] = "C+";
                    totalHuruf[3] += jumlahHuruf;
                } else if (nilai[i] > 50) {
                    huruf[i] = "C";
                    totalHuruf[4] += jumlahHuruf;
                } else if (nilai[i] > 39) {
                    huruf[i] = "D";
                    totalHuruf[5] += jumlahHuruf;
                } else {
                    huruf[i] = "E";
                    totalHuruf[6] += jumlahHuruf;
                }

            rata += nilai[i];
        }

        double rataNilai = rata / nilai.length;

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        String namaTertinggi = nama[0];
        String namaTerendah = nama[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
                namaTertinggi = nama[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
                namaTerendah = nama[i];
            }
        }

        System.out.printf("%-15s %-15s %-15s\n", 
            "Nama", "Nilai", "Huruf");
        System.out.println("-".repeat(40));

        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("%-15s %-15d %-15s\n", 
            nama[i], nilai[i], huruf[i]);   
        }

        System.out.println("=".repeat(40));
        System.out.println("Rata-rata       : " + rataNilai);
        System.out.println("Nilai tertinggi : " + namaTertinggi);
        System.out.println("Nilai terendah  : " + namaTerendah);
        System.out.println("Jumlah A        : " + totalHuruf[0]);
        System.out.println("Jumlah B+       : " + totalHuruf[1]);
        System.out.println("Jumlah B        : " + totalHuruf[2]);
        System.out.println("Jumlah C+       : " + totalHuruf[3]);
        System.out.println("Jumlah C        : " + totalHuruf[4]);
        System.out.println("Jumlah D        : " + totalHuruf[5]);
        System.out.println("Jumlah E        : " + totalHuruf[6]);
    }
}
