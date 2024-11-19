package praktikum_soal;

import java.util.Scanner;

public class Praktikum5S4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        System.out.print("Masukkan angka : ");
        int angka = in.nextInt();
        if (angka > 1) {
            for (i = 1; i <= 9; i++) {
                if (angka % i == 0 && i > 1) {
                    System.out.println(angka + " merupakan angka kelipatan " + i);
                }
            }
        } else {
            System.out.println(angka);
        }
    }
}
