package MembuatArray;

public class Array_contoh1 {
    public static void main(String[] args) {

        // Pembuatan Array Cara ke 1
        String[] stringArray;
        stringArray = new String[3];

        // Pembuatan Array Cara ke 2
        String[] stringArray2 = new String[3];

        // Pembuatan Array Cara ke 3
        int[] arrayInt = new int[] { 10, 90, 80, 67, 29 };

        // Pembuatan Array Cara ke 4
        String[] namaNama = {"Eko","Kurniawan","Khaneddy"};

        stringArray[0] = "Eko";
        stringArray[1] = "Kurniawan";
        stringArray[2] = "Khaneddy";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        // mengubah array indeks 0
        stringArray[0] = "Budi";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

    }
}
