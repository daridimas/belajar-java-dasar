package MembuatArray;

public class arrayInitializer {
    public static void main(String[] args) {
        int[] arrayInt = new int[] {
                10, 90, 80, 67, 29
        }; // cara ini tidak ditentukan berapa jumlah / panjang array-nya di
           // = new int[tidak_diisi_jumlah] {}

        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[1]);
        System.out.println(arrayInt[2]);
        System.out.println(arrayInt[3]);
        System.out.println(arrayInt[4]);
        System.out.println(arrayInt[0] + arrayInt[1] + arrayInt[2] + arrayInt[3] + arrayInt[4]);
    }
}
