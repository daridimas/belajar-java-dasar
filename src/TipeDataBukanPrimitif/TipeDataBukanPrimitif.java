package TipeDataBukanPrimitif;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = null;
        System.out.println(iniInteger);
        iniInteger = 10;
        System.out.println(iniInteger);

        Long iniLong = null;
        System.out.println(iniLong);
        iniLong = 10_000L;
        System.out.println(iniLong);

        Boolean iniBoolean = null;
        System.out.println(iniBoolean);
        iniBoolean = true;
        System.out.println(iniBoolean);

        Short iniShort = null;
        System.out.println(iniShort);
        iniShort = 100;
        System.out.println(iniShort);

        Byte iniByte = null;
        System.out.println(iniByte);
        iniByte = 100;
        System.out.println(iniByte);


        // Konversi dari data primitif ke bukan data primitif
        int age = 100;
        Integer ageObject = age;

        System.out.println(ageObject);

        // Konversi dari data bukan primitif ke data primitif
        int ageagain = ageObject;

        // Konversi dari data bukan primitif ke data primitif tapi beda data type
        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
        float floatAge = ageObject.floatValue();

        System.out.println(shortAge);
        System.out.println(byteAge);
        System.out.println(floatAge);

    }
}
