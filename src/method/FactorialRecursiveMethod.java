package method;

public class FactorialRecursiveMethod {
    public static void main(String[] args) {
        /*
            Recursive Method adalah kemampuan method memanggil method dirinya sendiri
            Kadang memang ada banyak problem yang lebih mudah diselesaikan menggunakan recursive method,
            seperti contohnya kasus factorial
         */

        // ini adalah contoh recursive method

        // jika nilainya 5 maka faktorialnya adalah 1 * 2 * 3 * 4 * 5 (dikalikan angka2 sebelumnya)

        /*
            Penggunaan Recursive Method perlu berhati-hati

            Jika recurive terlalu dalam / banyak sekali, maka akan ada kemungkinan terjadi error StackOverflow
            yaitu eerror dimana stack method terlalu banyak di Java

            Problem ini terjadi karena ketika kita memanggil method, Java akan menyimpannya dalam Stack / Antrian
            Jika method tersebut memanggil method lain, maka stack akan menumpuk terus, dan jika terlalu dalam,
            maka stack akan terlalu besar, dan bisa menyebabkan error StackOverFlow.

            Berapa jumlah maksimal menimbulkan StackOverFlow? tergantung OS dan besar memorynya
         */

        var values = 10;

        System.out.println(factorialLoop(values));
        System.out.println(factorialRecursive(values));
    }

    static int factorialLoop(int value) {
        var result = 1;

        for (var counter = 1; counter <= value; counter++) {
            result = result * counter; // bisa juga result *= counter
        }

        return result;
    }

    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

}
