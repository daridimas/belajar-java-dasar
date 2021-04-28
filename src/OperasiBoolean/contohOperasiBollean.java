package OperasiBoolean;

public class contohOperasiBollean {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);

        // pakai cara IF

        if (absen >= 75 && nilaiAkhir >= 75) {
            System.out.println("Anda lulus");
        } else {
            System.out.println("Maaf Anda Tidak Lulus!");
        }
    }
}
