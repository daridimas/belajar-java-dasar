package OperasiBoolean;

public class operasiBoolean {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;

        System.out.println(a && b);
        System.out.println(a || b);

        //kasus
        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >=75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);

        var lulus1 = lulusAbsen || lulusNilaiAkhir;
        System.out.println(lulus1);

        lulus = !lulus;
        System.out.println(lulus);

        lulus1 = !lulus1;
        System.out.println(lulus1);

    }
}
