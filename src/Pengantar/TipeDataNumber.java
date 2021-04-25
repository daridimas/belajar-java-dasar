import com.sun.source.tree.LiteralTree;

public class TipeDataNumber {
    public static void main(String[] args) {
    byte iniByte = 100;
    short iniShort = 1000;
    int iniInteger = 1000000;
    long iniLong = 1000000;
    long iniLong2 = 1000000L;

        /*
            Literal untuk menyatakan bilang pecahan 10 (desimal), pecahan 16 hexadesimal, atau binari

            int decimalInt = 25;
            int hexInt = 0xA132B;
            int binInt = 0b01010101;

         */


        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniLong2);


        float iniFloat = 10.12F;
        double iniDouble = 12.2424;

        System.out.println(iniFloat);
        System.out.println(iniDouble);

        /*
            Literal
         */
        int decimalInt = 25;
        int hexaDecimal = 0xA132B; // Depannya harus tambah 0x
        int binaryDecimal = 0b01010101; // Depannya harus tambah 0b

        System.out.println(decimalInt);
        System.out.println(hexaDecimal);
        System.out.println(binaryDecimal);

        /*
            Underscore = hanya digunakan sebagai pemisah angka agar mudah dibaca saja
            Tidak terpengaruh pada hasil kalkulasi
            Mulai diperkenalkan pada Java versi 7 atau 8
         */

        long balance = 1_000_000_000_000L;
        int sum = 1_000_000_000;

        System.out.println(balance);
        System.out.println(sum);
    }

}
