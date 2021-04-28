package MembuatArray;

public class arrayMenghapusData {
    public static void main(String[] args) {
        /*
        Sebenarnya tidak ada istilah menghapus Array, maksudnya menghapus array berindeks 10 supaya menjadi 9
        cara seperti itu tidak ada. Karena panjang Array adalah sudah Fix / tidak dapat berubah.

        Cara yang benar adalah mengubah datanya menjadi null / 0
         */

        long[] arrayLong = {
                10L,20L,30L,40L
        };

        arrayLong[0] = 0; // artinya mengubah indeks ke-0 menjadi angka nol

        System.out.println(arrayLong[0]);

        String[] namaNama = {"Eko", "Kurniawan", "Khaneddy"};

        System.out.println(namaNama[2]);

        namaNama[2] = null;

        System.out.println(namaNama[2]);
    }
}
