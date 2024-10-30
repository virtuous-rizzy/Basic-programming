package Perulangan;

import java.util.Scanner;

public class LatihanSoal2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int segitiga;
        System.out.print("Masukkan jumlah segitiga : ");
        segitiga = in.nextInt();

        for (int i = 1; i <= segitiga; i++) {
            for (int i2 = 1; i2 <= segitiga - i; i2++) {
                System.out.print("1");
            }
            for (int i3 = 1; i3 <= 2 * i - 1; i3++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
