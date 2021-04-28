package Scope;

public class ContohScope {
    public static void main(String[] args) {
//        System.out.println(hello); // ini error karena variabel diluar method main
//        System.out.println(hi); // ini error karena variabel diluar method main

        sayHello("Eko");
        sayHello("");
    }

    static void sayHello(String name) {
        String hello = "Hello " + name;

        if (!name.isBlank()) { // false
            String hi = "Hi " + name;
            System.out.println(hi);
//            System.out.println(hello); // variabel hello bisa diakses karena masih di dalam block hello
        }

        System.out.println(hello);
//        System.out.println(hi); // ini error karena variabel hi hanya ada di didalam blok IF
    }
}
