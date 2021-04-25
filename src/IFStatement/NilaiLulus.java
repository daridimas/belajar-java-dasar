package IFStatement;

public class NilaiLulus {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 90;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("Anda Lulus!");
        } else {
            System.out.println("Anda Gagal!");
        }

        // IF Statement di atas equivalen dengan
        var lulusNilai = nilai >= 75;
        var lulusAbsen = absen >= 75;

        var lulus = lulusNilai && lulusAbsen;

        if (lulus) {
            System.out.println("Selamat Anda Lulus!");
        } else {
            System.out.println("Maaf Anda Gagal!");
        }

    }
}
