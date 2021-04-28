package method;

public class MethodParameter {
    public static void main(String[] args) {
        /*
        - Kita bisa mengirim informasi ke method yang ingin kita panggil
        - Untuk melakukannya, kita perlu menambahkan parameter atau argument di method yang sudah kita buat
        - Cara membuat parameter sama seperti cara membuat variabel
        - Parameter ditempatkan di dalam kurung () di deklarasi method
        - Parameter bisa lebih dari satu, dipisahkan dengan tanda koma
         */

        sayHello("Eko", "Kurniawan");
        sayHello("Dimas", "Prasojo");
        sayHello("Joko", "Nugroho");

    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

}
