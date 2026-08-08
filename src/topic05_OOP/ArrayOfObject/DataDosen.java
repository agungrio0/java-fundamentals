package topic05_OOP.ArrayOfObject;

public class DataDosen {
    void dataSemuaDosen(Dosen[] arrDosen) {
        for (int i = 0; i < arrDosen.length; i++) {
            System.out.println("==== Data Dosen Ke-" + (i + 1) + " ====");
            System.out.println("Kode          : " + arrDosen[i].kode);
            System.out.println("Nama          : " + arrDosen[i].nama);
            System.out.println("Jenis Kelamin : " + (arrDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + arrDosen[i].usia);
            System.out.println("-".repeat(25));
        }
    }

    int[] jumlahDosenPerJenisKelamin(Dosen[] arrDosen) {
        int pria = 0;
        int wanita = 0;

        for (int i = 0; i < arrDosen.length; i++) {
            if (arrDosen[i].jenisKelamin == true) {
                pria++;
            } else {
                wanita++;
            }
        }

        return new int[] {pria, wanita};
    } 

    int[] rerataUsiaDosenPerJenisKelamin(Dosen[] arrDosen) {
        int pria = 0;
        int wanita = 0;
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int rerataPria = 0;
        int rerataWanita = 0;

        for (int i = 0; i < arrDosen.length; i++) {
            if (arrDosen[i].jenisKelamin == true) {
                pria++;
                totalUsiaPria += arrDosen[i].usia;
            } else {
                wanita++;
                totalUsiaWanita += arrDosen[i].usia;
            }
        }

        if (pria > 0) {
            rerataPria = totalUsiaPria / pria;
        }

        if (wanita > 0) {
            rerataWanita = totalUsiaWanita / wanita;
        }

        return new int[] {rerataPria, rerataWanita};
    } 

    int infoDosenPalingTua(Dosen[] arrDosen) {
        int tua = arrDosen[0].usia;
        
        for (int i = 0; i < arrDosen.length; i++) {
            if (arrDosen[i].usia > tua) {
                tua = arrDosen[i].usia;
            }
        }

        return tua;
    }

    int infoDosenPalingMuda(Dosen[] arrDosen) {
        int muda = arrDosen[0].usia;

        for (int i = 0; i < arrDosen.length; i++) {
            if (arrDosen[i].usia < muda) {
                muda = arrDosen[i].usia;
            }
        }

        return muda;
    }
    
}
