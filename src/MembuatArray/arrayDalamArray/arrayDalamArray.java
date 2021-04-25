package MembuatArray.arrayDalamArray;

public class arrayDalamArray {
    public static void main(String[] args) {
        String[][] members ={
                {"Eko", "Kurniawan"},
                {"Budi", "Nugraha"},
                {"Joko",""}
        };

        System.out.println(members[0][0]); // Hasilnya: Eko
        System.out.println(members[0][1]); // Hasilnya: Kurniawan

        System.out.println(members[1][0]); // Hasilnya: Budi
        System.out.println(members[1][1]); // Hasilnya: Nugraha

        System.out.println(members[2][0]); // Hasilnya: Joko
        System.out.println(members[2][1]); // Hasilnya: null


    }
}
