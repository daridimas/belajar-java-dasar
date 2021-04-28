package Perulangan.BreakContinue;

public class contohContinue {
    public static void main(String[] args) {

        for (var counter = 1; counter <= 100; counter++) { //perulangan dari 1 - 100
            if (counter % 2 == 0) {
                continue; // menghentikan eksekusi statement ke bawah dan langsung periksa kondisi perulangan berikutnya
            }

            System.out.println("Perulangan Ganjil " + counter);

//            if (counter % 2 == 1) {
//                continue;
//            }
//
//            System.out.println("Perulangan Genap " + counter);
        }
    }
}
