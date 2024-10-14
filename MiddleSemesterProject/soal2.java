package uts;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Pilih operator +,-,*,atau / : ");
        String operator = in.nextLine();
        System.out.print("Bilangan 1 : ");
        double bil1 = in.nextInt();
        System.out.print("Bilangan 2 : ");
        double bil2 = in.nextInt();

        if (operator.equalsIgnoreCase("+")) {
            double hasil = bil1 + bil2;
            System.out.println("Hasil      : " + hasil);
        } else if (operator.equalsIgnoreCase("-")){
            double hasil = bil1 - bil2;
            System.out.println("Hasil      : " + hasil);
        } else if (operator.equalsIgnoreCase("*")){
            double hasil = bil1 * bil2;
            System.out.println("Hasil      : " + hasil);
        } else if (operator.equalsIgnoreCase("/")){
            double hasil = bil1 / bil2;
            System.out.println("Hasil      : " + hasil);
        } else {
            System.out.println("OPERATOR YANG ANDA PILIH INVALID");
        }

    }
}
