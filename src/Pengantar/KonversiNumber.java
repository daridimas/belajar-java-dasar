public class KonversiNumber {
    public static void main(String[] args) {
        /*
            Widening Casting (otomatis) : byte -> short -> int -> long -> float -> double
            Narrowing Casting (manual) : double -> float -> long -> int -> char -> short -> byte
         */

        // Konversi Otomatis
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        // Konversi Manual
        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;

        // Kasus Number Overflow atau angka berputar
        int iniInt3 = 1000;
        byte iniByte2 = (byte) iniInt3;
        // terkena number overflow kapasitas byte tidak muat dan akan kembali ke minus / looping


    }
}
