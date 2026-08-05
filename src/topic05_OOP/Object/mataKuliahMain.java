package topic05_OOP.Latihan;

public class mataKuliahMain {
    public static void main(String[] args) {
        mataKuliah mhs1 = new mataKuliah("124", "Agung", 4, 8);
        
        mhs1.tampilInformasi();
        mhs1.ubahSKS(5);
        mhs1.tambahJam(10);
        mhs1.tampilInformasi();

        mataKuliah mhs2 = new mataKuliah("154", "Cheria", 2, 4);
        mhs2.tampilInformasi();
        mhs2.kurangiJam(6);
        mhs2.tampilInformasi();
        
    }

    
}
