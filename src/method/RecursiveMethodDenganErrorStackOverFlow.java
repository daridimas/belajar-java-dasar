package method;

public class RecursiveMethodDenganErrorStackOverFlow {
    public static void main(String[] args) {
        // Lihat Warning dibawah ini..!!!!
        /*
            Penggunaan Recursive Method perlu berhati-hati

            Jika recurive terlalu dalam / banyak sekali, maka akan ada kemungkinan terjadi error StackOverflow
            yaitu eerror dimana stack method terlalu banyak di Java

            Problem ini terjadi karena ketika kita memanggil method, Java akan menyimpannya dalam Stack / Antrian
            Jika method tersebut memanggil method lain, maka stack akan menumpuk terus, dan jika terlalu dalam,
            maka stack akan terlalu besar, dan bisa menyebabkan error StackOverFlow.

            Berapa jumlah maksimal menimbulkan StackOverFlow? tergantung OS dan besar memorynya
         */

        loop(10000);
    }

    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop-" + value);
            loop(value - 1);
        }
    }
}
