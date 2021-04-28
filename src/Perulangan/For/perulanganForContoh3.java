package Perulangan.For;

public class perulanganForContoh3 {
    public static void main(String[] args) {
        /*
            Struktur for adalah
            for ( initstatement; kondisi; poststatement) {
                // blok perulangan
            }
            inistatement : dieksekusi pertama kali diawal
            kondisi : dilakukan pengecekan setiap perulangan, kondisi true perulangan dilakukan, kondisi false akan berhenti
            poststatement : akan diesksekusi sekali di akhir perulangan
         */

        // contoh kita akan menuliskan Perulangan sebanyak 10 kali



        for (var counter = 1; counter <= 10; counter++) {
            System.out.println("Perulangan " + counter);


        }


    }
}
