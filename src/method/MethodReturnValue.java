package method;

public class MethodReturnValue {
    public static void main(String[] args) {
        /*
        Secara default, method tidak menghasilkan value.
        Agar method bisa menghasilkan value, kita harus mengubah kata kunci void dengan tipe data yang dihasilkan

        Di dalam block method untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci return, lalu diikuti
        dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method.

        Di Java, kita hanya bisa menghasilkan 1 data di sebuah methodd, tidak bisa lebih
         */

        var a = 100;
        var b = 200;
        var result = penjumlahan(a,b);

        System.out.println(result); // memanggil method dengan variabel yang sudah ditentukan

        System.out.println(penjumlahan(200, 200)); // langsung panggil method dan isi parameter

        System.out.println(hitung(100, "+", 100));
        System.out.println(hitung(200, "-", 100));
        System.out.println(hitung(200, "salah", 100));

    }

    static int penjumlahan(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;

        }
    }
}
