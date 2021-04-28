package Perulangan.BreakContinue;

public class pendahuluan {
    public static void main(String[] args) {
        /*
        pada Switch Case, kata kunci break untuk menghentikan case dalam switch

        sama dalam perulangan, break juga digunakan untuk menghentikan seluruh perulangan

        sedangkan continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan berikutnya
         */

        // contoh penggunaan break, menghentikan seluruh perulangan

        var counter = 1;

        while (true) { // kondisi while dipaksa selalu benar
            System.out.println("Perulangan ke-" + counter);
            counter++;

            if (counter > 10) { // jika counter sudah lebih dari 10, perulangan berhenti karena break
                break;
            }
        }

        System.out.println("Perulangan Berhenti!!");

    }
}
