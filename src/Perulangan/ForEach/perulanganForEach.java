package Perulangan.ForEach;

public class perulanganForEach {
    public static void main(String[] args) {

        String[] names = {
                "Eko", "Kurniawan", "Khannedy",
                "Programmer", "Zaman", "Now"
        };

        System.out.println("FOR EACH");

        // for (String name: names) { // bisa juga pakai String
        for (var name: names) {
            System.out.println(name);
        }
    }
}
