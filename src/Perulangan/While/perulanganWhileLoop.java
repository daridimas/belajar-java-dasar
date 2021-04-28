package Perulangan.While;

public class perulanganWhileLoop {
    public static void main(String[] args) {

        /*
        While Loop perulangan yang lebih sederhana, tidak ada initstatement dan poststatemen
         */
        var counter = 1;

        while (counter <= 10) { //  hanya ada kondisi
            System.out.println("Perulangan " + counter);

            counter++;
        }
    }
}
