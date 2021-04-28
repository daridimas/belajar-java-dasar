package switchStatement;

public class nilaiLulus {
    public static void main(String[] args) {
        var nilai = "F";

        switch (nilai) {
            case "A":
                System.out.println("Wow Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

    }
}
