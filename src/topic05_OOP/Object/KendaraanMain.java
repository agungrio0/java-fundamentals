package topic05_OOP.Object;
import java.util.Scanner;

public class KendaraanMain {
    public static void main(String[] args) {
        Scanner agung = new Scanner(System.in);

        Kendaraan k1 = new Kendaraan("k0001", "Toyota Avanza", "Mobil", 300000, true);
        Kendaraan k2 = new Kendaraan("k0002", "Honda CRV", "Mobil", 400000, true);
        Kendaraan k3 = new Kendaraan("k0041", "Honda Beat", "Motor", 75000, true);
        
        int menu;
        int menuSewa;

        do {
            System.out.println("=".repeat(10) + " SEWA KENDARAAN " + "=".repeat(10));
            System.out.println("1. Sewa");
            System.out.println("2. Kembalikan");
            System.out.println("3. Menu Admin"); //berisikan ubah tarif
            System.out.println("0. Keluar");
            System.out.print("Pilih (1-2) : ");
            menu = agung.nextInt();
            agung.nextLine();

            if (menu == 1) {  
                do {
                    System.out.println("=".repeat(10) + " JENIS KENDARAAN " + "=".repeat(10));
                    System.out.println("1. Mobil");
                    System.out.println("2. Motor");
                    System.out.println("0. Keluar");
                    System.out.print("Pilih (1-2) : ");
                    menuSewa = agung.nextInt();
                    agung.nextLine();
        
                    if (menuSewa == 1) {
                        k1.tampilInformasi();
                        k2.tampilInformasi();
                        System.out.print("Masukkan nama kendaraan yang ingin anda sewa : ");
                        String pilihMobil = agung.nextLine();
        
                        if ("Toyota Avanza".equalsIgnoreCase(pilihMobil)) {
                            k1.sewaKendaraan(false);
                        } else if ("Honda CRV".equalsIgnoreCase(pilihMobil)) {
                            k2.sewaKendaraan(false);
                        }
                    } else if (menuSewa == 2) {
                        k3.tampilInformasi();
                        System.out.print("Masukkan nama kendaraan yang ingin anda sewa : ");
                        String pilihMotor = agung.nextLine();
    
                        if ("Honda Beat".equalsIgnoreCase(pilihMotor)) {
                            k3.sewaKendaraan(false);
                        }
                    }
                } while (menuSewa != 0);        
            } else if (menu == 2) {
                System.out.print("Masukkan Kode Kendaraan : ");
                String kode = agung.nextLine();
                if ("k0001".equals(kode)) {
                    k1.kembalikanKendaraan();
                } else if ("k0002".equals(kode)) {
                    k2.kembalikanKendaraan();
                } else if ("k0041".equals(kode)) {
                    k3.kembalikanKendaraan();
                }
            } else if (menu == 3) {
                System.out.print("Masukkan Kode Kendaraan : ");
                String kode = agung.nextLine();

                int tarif;
                if ("k0001".equals(kode)) {
                    System.out.print("Masukkan Tarif Baru : ");
                    tarif = agung.nextInt();
                    k1.ubahTarif(tarif);
                } else if ("k0002".equals(kode)) {
                    System.out.print("Masukkan Tarif Baru : ");
                    tarif = agung.nextInt();
                    k2.ubahTarif(tarif);
                } else if ("k0041".equals(kode)) {
                    System.out.print("Masukkan Tarif Baru : ");
                    tarif = agung.nextInt();
                    k3.ubahTarif(tarif);
                }
            }
        } while (menu != 0);
    }
}
