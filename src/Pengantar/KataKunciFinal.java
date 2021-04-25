public class KataKunciFinal {
    public static void main(String[] args) {
        final String name = "Dimas Arie Prasojo";
        var age = 30;
        var address = "Indonesia";

        // name = "Nama Diubah";
        // error karena kata kunci final akan mengubah variabel menjadi konstanta
        // Konstanta = Konstan = Tidak dapat diubah

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

    }
}
