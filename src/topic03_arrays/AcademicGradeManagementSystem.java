package topic03_arrays;

import java.util.Scanner;

public class AcademicGradeManagementSystem {
    public static void main(String[] args) {
        Scanner agung = new Scanner(System.in);

        String[] mk = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {
            2, 2, 2, 3, 2, 2, 3, 2
        }; 

        int[] jumlahHuruf = new int[7];
        int nilai[] = new int[8];
        String[] huruf = new String[8];
        double[] setara = new double[8];

        int menu;
        int totalSKS = 0;
        double totalNilai = 0;

        do {
            System.out.println("=".repeat(30));
            System.out.println("MENU");
            System.out.println("=".repeat(30));
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampilkan Semua");
            System.out.println("3. Cari Mata Kuliah");
            System.out.println("4. Mata Kuliah Tertinggi");
            System.out.println("5. Mata Kuliah Terendah");
            System.out.println("6. Statistik");
            System.out.println("7. Keluar");
            System.out.print("Pilih Menu (1-7): ");
            menu = agung.nextInt();
            agung.nextLine();
            
            if (menu <= 0 || menu > 7) {
                System.out.println("Menu Tidak Valid!");
            } else {
                if (menu == 1) {
                    for (int i = 0; i < jumlahHuruf.length; i++) {
                        jumlahHuruf[i] = 0;
                    }

                    totalSKS = 0;
                    totalNilai = 0;
                    for (int i = 0; i < mk.length; i++) {
                        do {
                            System.out.print("Masukkan nilai " + mk[i] + ": ");
                            nilai[i] = agung.nextInt();
                            if (nilai[i] < 0 || nilai[i] > 100) {
                                System.out.println("Nilai tidak valid! Input ulang!");
                            } 
                        } while (nilai[i] < 0 || nilai[i] > 100);
                            if (nilai[i] > 80) {
                                huruf[i] = "A";
                                setara[i] = 4;
                                jumlahHuruf[0]++;
                            } else if (nilai[i] > 73) {
                                huruf[i] = "B+";
                                setara[i] = 3.5;
                                jumlahHuruf[1]++;
                            } else if (nilai[i] > 65) {
                                huruf[i] = "B";
                                setara[i] = 3;
                                jumlahHuruf[2]++;
                            } else if (nilai[i] > 60) {
                                huruf[i] = "C+";
                                setara[i] = 2.5;
                                jumlahHuruf[3]++;
                            } else if (nilai[i] > 50) {
                                huruf[i] = "C";
                                setara[i] = 2;
                                jumlahHuruf[4]++;
                            } else if (nilai[i] > 39) {
                                huruf[i] = "D";
                                setara[i] = 1;
                                jumlahHuruf[5]++;
                            } else {
                                huruf[i] = "E";
                                setara[i] = 0;
                                jumlahHuruf[6]++;
                            }

                            double totalPerNilai = sks[i] * setara[i];
                            totalNilai += totalPerNilai;
                            totalSKS += sks[i];
                    
                        } 
                } else if (menu == 2) {
                    if (totalSKS == 0) {
                        System.out.println("Silahkan input nilai terlebih dahulu!");
                    } else {
                        System.out.println("=".repeat(30));
                        System.out.println("Daftar Nilai Mahasiswa");
                        System.out.println("=".repeat(30));
                        System.out.printf("%-40s %-15s %-15s %-15s %-15s\n", 
                        "Mata Kuliah", "SKS", "Nilai", "Huruf", "Setara");
                        for (int i = 0; i < mk.length; i++) {
                            System.out.printf("%-40s %-15d %-15d %-15s %-15.1f\n", 
                            mk[i], sks[i], nilai[i], huruf[i], setara[i]);
                        }
                    }
                } else if (menu == 3) {
                    System.out.print("Masukkan Mata Kuliah yang ingin Anda cari: ");
                    String cari = agung.nextLine();
                    
                    boolean ketemu = false;
                    for (int i = 0; i < mk.length; i++) {
                        if (mk[i].equalsIgnoreCase(cari)) {  
                            System.out.printf("%-40s %-15s %-15s %-15s %-15s\n", 
                            "Mata Kuliah", "SKS", "Nilai", "Huruf", "Setara");
                            
                            System.out.printf("%-40s %-15d %-15d %-15s %-15.1f\n", 
                                mk[i], sks[i], nilai[i], huruf[i], setara[i]);
                            ketemu = true;
                            break;    
                        }
                    }                    
                    if (ketemu == false) {
                        System.out.println("Mata Kuliah yang Anda cari tidak ditemukan!");                   
                    }
                } else if (menu == 4) {
                    if (totalSKS == 0) {
                        System.out.println("Silahkan input nilai terlebih dahulu!");
                    } else {
                        int tertinggi = nilai[0];
                        String mkTertinggi = mk[0];
    
                        for (int i = 0; i < mk.length; i++) {
                            if (nilai[i] > tertinggi) {
                                tertinggi = nilai[i];
                                mkTertinggi = mk[i];
                            }
                        }
                        System.out.println("Mata kuliah " + mkTertinggi + " dengan perolehan nilai " + tertinggi);
                    }
                } else if (menu == 5) {
                    if (totalSKS == 0) {
                        System.out.println("Silahkan input nilai terlebih dahulu!");
                    } else {
                        int terendah = nilai[0];
                        String mkTerendah = mk[0];
    
                        for (int i = 0; i < mk.length; i++) {
                            if (nilai[i] < terendah) {
                                terendah = nilai[i];
                                mkTerendah = mk[i];
                            }
                        }
                        System.out.println("Mata kuliah " + mkTerendah + " dengan perolehan nilai " + terendah);
                    }
                } else if (menu == 6) {
                    if (totalSKS == 0) {
                        System.out.println("Silahkan input nilai terlebih dahulu!");
                    } else {
                        System.out.println("Jumlah Mata Kuliah        : " + mk.length);
                        System.out.println("Total SKS                 : " + totalSKS);
                        double ip = totalNilai / totalSKS;
                        System.out.printf("IP Semester               : %.2f\n", ip);
                        System.out.println("Jumlah yang mendapat A    : " + jumlahHuruf[0]);
                        System.out.println("Jumlah yang mendapat B+   : " + jumlahHuruf[1]);
                        System.out.println("Jumlah yang mendapat B    : " + jumlahHuruf[2]);
                        System.out.println("Jumlah yang mendapat C+   : " + jumlahHuruf[3]);
                        System.out.println("Jumlah yang mendapat C    : " + jumlahHuruf[4]);
                        System.out.println("Jumlah yang mendapat D    : " + jumlahHuruf[5]);
                        System.out.println("Jumlah yang mendapat E    : " + jumlahHuruf[6]);
                    }
                }
            }  
        } while (menu != 7);
            System.out.println("Terimakasih.");
    }
}
