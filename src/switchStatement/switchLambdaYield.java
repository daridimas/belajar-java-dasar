package switchStatement;

public class switchLambdaYield {
    public static void main(String[] args) {
        var nilai = "A";

        String ucapan = switch (nilai) {

            case "A":
                yield "Wow Anda Lulus dengan Baik";
            case "B", "C":
                yield "Anda Lulus";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Mungkin Anda Salah Jurusan";
        };

        System.out.println(ucapan);
    }
}
