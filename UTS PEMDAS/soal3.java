package uts;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Pilih operator +,-,*,atau / : ");
        String operator = in.nextLine();
        System.out.print("Bilangan 1 : ");
        double bil1 = in.nextDouble();
        System.out.print("Bilangan 2 : ");
        double bil2 = in.nextDouble();

        switch (operator) {
            case "+":
                double hasil = bil1 + bil2;
                System.out.println("Hasil      : " + hasil);
                break;
            case "-":
                hasil = bil1 - bil2;
                System.out.println("Hasil      : " + hasil);
                break;
            case "*":
                hasil = bil1 * bil2;
                System.out.println("Hasil      : " + hasil);
                break;
            case "/":
                hasil = bil1 / bil2;
                System.out.println("Hasil      : " + hasil);
                break;
            default:
                System.out.println("OPERATOR YANG ANDA PILIH INVALID");
                break;
        }
    }
}
