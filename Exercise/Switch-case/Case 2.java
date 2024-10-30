package LatihanSoal;

import java.util.Scanner;

public class LatSwitch2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Berapakah 7 * 7 ?");
        System.out.println("a.21\nb.49\nc.35\nd.14\ne.56");
        System.out.print("Jawaban anda : ");
        String hasil = in.nextLine();

        switch (hasil.toLowerCase()) {
            case "A":
            case "a":
            case "B":
            case "b":
            case "C":
            case "c":
                System.out.println("jawaban salah");
                break;
            case "D":
            case "d":
                System.out.println("jawaban benar");
                break;
            default:
                System.out.println("pilihan invalid");

        }
    }
}
