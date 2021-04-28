package method;

public class MethodOverloading {
    public static void main(String[] args) {
        /*
        Method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali.

        Namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda-beda,
        entah jumlah atau tipe data parameternya.

        Jika ada yang sama, maka program kita error
         */

        sayHello();
        sayHello("Dimas");
        sayHello("Dimas Arie", "Prasojo");

    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstname, String lastname) {
        System.out.println("Hello " + firstname + " " + lastname);
    }

}
