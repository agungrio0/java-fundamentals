package topic04_fungsi;

public class StudentGradeManagementSystem {
    static String[] nama = {
        "Agung", "Budi", "Robi", "Chelsi", "Cheria"
    };

    static String[] mk = {
        "Algo", "DB", "PBO", "Math"
    };

    static int[][] nilai = {
        {90, 85, 88, 92},
        {70, 75, 68, 80},
        {66, 54, 88, 76},
        {36, 77, 89, 55},
        {68, 70, 77, 98}
    };

    static void info() {
        System.out.println("=".repeat(60));
        System.out.printf("%-15s", "Nama");
        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-10s", mk[i]);
        }
        System.out.println("");
        System.out.println("-".repeat(60));
        for (int i = 0; i < nama.length; i++) {
            System.out.printf("%-15s", nama[i]);
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.printf("%-10d", nilai[i][j]);
            }
            System.out.println("");
        }
        System.out.println("=".repeat(60));
    }

    static int hitung(int baris) {
        int nilaiPerMk = 0;
        for (int i = 0; i < nilai[baris].length; i++) {
            nilaiPerMk += nilai[baris][i];
        } 
        return nilaiPerMk / mk.length;
    }

    static char huruf(int nilai) {
        if (nilai > 80) {
            return 'A';
        } else if (nilai > 65) {
            return 'B';
        } else if (nilai > 50) {
            return 'C';
        } else if (nilai > 39) {
            return 'D';
        } else {
            return 'E';
        }
    }

    static String statusKelulusan (char huruf) {
        if (huruf == 'A') {
            return "Lulus";
        } else if (huruf == 'B') {
            return "Lulus";
        } else if (huruf == 'C') {
            return "Remidi";
        } else if (huruf == 'D') {
            return "Tidak Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    static void status() {
        System.out.printf("%-10s %-15s %-10s %-10s\n", "Nama", "Nilai Akhir", "Huruf", "Status");
        System.out.println("-".repeat(60));
        for (int i = 0; i < nama.length; i++) {
            int nilaiPerMatkul = hitung(i);
            char grade = huruf(nilaiPerMatkul);
            String status = statusKelulusan(grade);
            
            System.out.printf("%-15s", nama[i]);
            System.out.printf("%-13d", nilaiPerMatkul);
            System.out.printf("%-10s", grade);
            System.out.printf("%-10s", status);
            System.out.println("");
        }
        System.out.println("-".repeat(60));
    }

    static void nilaiTerbaik() {
        int terbaik = hitung(0);
        String namaMhs = nama[0];
        for (int i = 0; i < nama.length; i++) {
            if (hitung(i) > terbaik) {
                terbaik = hitung(i);
                namaMhs = nama[i];
            }
        }
        System.out.println("Nama dengan nilai terbaik : " + namaMhs);
        System.out.println("Perolehan nilai           : " + terbaik);
        System.out.println("=".repeat(60));
    }

    public static void main(String[] args) {
        info();
        status();
        nilaiTerbaik();
    }


}
