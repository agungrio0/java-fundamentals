package topic05_OOP.Object;

public class DosenMain {
    public static void main(String[] args) {
        Dosen dsn1 = new Dosen("21652", "Munki", 1999, "Problem Sloving");
        dsn1.setStatusAktif(true);
        dsn1.tampilInformasi();
        System.out.println("Lama Bekerja    : " + dsn1.hitungMasaKerja(2026));
        System.out.println("=".repeat(35));

        Dosen dsn2 = new Dosen("15432", "Erfan", 1981, "Aljabar Linier");
        dsn2.setStatusAktif(false);
        dsn2.tampilInformasi();
        System.out.println("Lama Bekerja    : " + dsn2.hitungMasaKerja(2020));
        System.out.println("=".repeat(35));

        Dosen dsn3 = new Dosen("624135", "Imam", 1990, "Elektro");
        dsn3.setStatusAktif(true);
        dsn3.tampilInformasi();
        System.out.println("Lama Bekerja    : " + dsn3.hitungMasaKerja(2026));
        System.out.println("");
        dsn3.ubahKeahlian("Algoritma & Struktur Data");
        System.out.println("=".repeat(65));
    }
}
