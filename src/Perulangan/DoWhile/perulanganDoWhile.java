package Perulangan.DoWhile;

public class perulanganDoWhile {
    public static void main(String[] args) {
        /*
        Mirip seperti While Loop namun perbedaannya pada pengecekan kondisi

        Pengecekan kondisi di While Loop dilakukan di awal sebelum perulangan dilakukan
        sedangkan di do while loop dilakukan setelah perulangan dilakukan

        oleh karena itu dalam do while loop, minimal pasti sekali perulangan dilakukan meskipun kondisi salah.
         */

        var counter = 100;

        do {
            System.out.println("Perulangan Ke-" + counter);
            counter++;
        } while (counter <= 10); // kondisi salah tapi karena pengecekan kondisi dilakukan setelah perulangan

    }
}
