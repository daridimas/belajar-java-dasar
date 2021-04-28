package Perulangan.ForEach;

public class pendahuluanForEach {
    public static void main(String[] args) {
        /*
        Perulangan biasanya digunakan untuk mengakses data array

        mengakses data array menggunakan perulangan sangat bertele-tele, kita harus :
        - membuat counter
        - lalu mengakses array menggunakan counter yang kita buat

        inilah kegunaan For Each yang bisa digunakan untuk mengakses seluruh data Array secara otomatis
         */

        //kita coba menggunakan for loop mengakses data array untuk melihat seberapa bertele-telenya ini

        String[] names = {
                "Eko", "Kurniawan", "Khannedy",
                "Programmer", "Zaman", "Now"
        };

        for (int i = 0; i < names.length; i++) { // kenapa < array.length karena indeks array dimulai dari 0 dan seterusnya
            System.out.println(names[i]);
        }
    }
}
