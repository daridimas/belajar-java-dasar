package method;

public class NonRecursiveMethod {
    public static void main(String[] args) {
        /*
            Recursive Method adalah kemampuan method memanggil method dirinya sendiri
            Kadang memang ada banyak problem yang lebih mudah diselesaikan menggunakan recursive method,
            seperti contohnya kasus factorial
         */

        // ini adalah contoh non recursive method (Kasus Factorial Loop) dengan menggunakan perulangan

        // jika nilainya 5 maka faktorialnya adalah 1 * 2 * 3 * 4 * 5 (dikalikan angka2 sebelumnya

        System.out.println(factorialLoop(5));
        System.out.println(1 * 2 * 3 * 4 * 5);
    }

    static int factorialLoop(int value) {
        var result = 1;

        for (var counter = 1; counter <= value; counter++) {
            result = result * counter; // bisa juga result *= counter
        }

        return result;
    }

}
