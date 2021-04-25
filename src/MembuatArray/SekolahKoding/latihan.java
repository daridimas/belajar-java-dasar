package MembuatArray.SekolahKoding;

public class latihan {
    //array 2d
    public static void main(String[] args) {
        // 00 01
        // 10 11
        // contoh array 2d

        String[][] kotak = new String[][]{
            {"Indonesia", "jakarta"},
            {"Italia", "roma"},
            {"Perancis", "paris"}
        }; // kenapa tidak bisa dibatasi arraynya ya..??

        for (int x=0; x<kotak.length; x++) {
            for (int y=0; y< kotak[x].length; y++) {
                System.out.println(kotak[x][y]); 
            }
        }
    }
}
