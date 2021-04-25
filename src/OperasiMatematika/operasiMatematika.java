package OperasiMatematika;

public class operasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


        // Augmented Assignment
        int c;

        c = 100;
        c += 10; // c = c + 10
        System.out.println(c);

        c = 100;
        c -= 10; // c = c - 10
        System.out.println(c);

        c = 100;
        c *= 10; // c = c * 10
        System.out.println(c);

        c = 100;
        c /= 10; // c = c / 10
        System.out.println(c);

        c = 100;
        c %= 10; // c = c % 10
        System.out.println(c);


        // Unary Operator, operasi matematika hanya menggunakan 1 variabel

        int d = +100; // kalo nilai positif, tidak wajib menggunakan +
        int e = -10;

        d++; // d = d + 1
        System.out.println(d);

        d--; // d = d - 1
        System.out.println(d);

        System.out.println(!true);


    }
}
