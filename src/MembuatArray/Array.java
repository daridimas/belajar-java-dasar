package MembuatArray;

public class Array {
    public static void main(String[] args) {
        String[] inistringArray;
        inistringArray = new String[3];
        inistringArray[0] = "Dimas";
        inistringArray[1] = "Arie";
        inistringArray[2] = "Prasojo";

        System.out.println(inistringArray[0]);
        System.out.println(inistringArray[1]);
        System.out.println(inistringArray[2]);

        inistringArray[0] = "Budi";

        System.out.println(inistringArray[0]);

        String[] stringArray2 = new String[3];

        String[] namaNama = {
                "Dimas", "Arie", "Prasojo"
        };

        System.out.println(namaNama[0]);
        System.out.println(namaNama[1]);
        System.out.println(namaNama[2]);


        int[] arrayInt = new int[] {
                1,2,3,4,5,6,7,8,9,10
        };

        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[5]);
        System.out.println(arrayInt[9]);


        long[] arrayLong = {
                10L, 20L, 30L
        };

        System.out.println(arrayLong.length);

        // untuk menghapus Array
        arrayLong[0] = 0;
        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong[2]);

        namaNama[0] = null;
        System.out.println(namaNama[0]);

        arrayLong = null;
        System.out.println(arrayLong);
        System.out.println(arrayLong[0]); // hasilnya error karena sudah tidak ada lagi nilanya


    }
}
