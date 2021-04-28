package method;

public class pendahuluanMethod {
    public static void main(String[] args) {
        /*
        - adalah mblock kode program yang akan berjalan saat kita panggil
        - contoh method println() untuk emanmpilkan tulisand i console
        - untuk membuat method, gunakan kata kunci void, lalu diikuti dengan nama method, () dan diakhiri dengan block
        - kita bisa memanggil method dengan menggunakan nama method lalu diikuti dengan kurung ()
        - dibahasa pemograman lain, Method disebut Function

         */

        sayHelloWorld();
        sayHelloWorld(); // panggil method kedua kali
        sayHelloWorld(); // panggil method ketiga kali

    }
        // keterangan, method static hanya bisa memanggil method static juga
    static void sayHelloWorld() {
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
    }
}
