package method;

public class MethodArray {
    public static void main(String[] args) {
        /*
        Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti

        Biasanya agar bisa seperti ini kita bisa gunakan Array sebagai parameter di method tersebut

        Namun di Java, kita bisa menggunakan variable argument untuk mengirim data yang berisi jumlah tak tentu, bisa
        nol atau lebih

        Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter

        // berikut ini contoh code Tanpa Variable Argument

         */

        int[] values = {80,50,50,50,80};

        sayCongrats("Dimas", values);

    }

    static void sayCongrats(String name, int[] values) {
        int total = 0;

        for (var value : values) {
            total += value;
        }

        int finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
