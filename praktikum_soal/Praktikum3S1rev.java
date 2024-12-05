package praktikum_soal;

import java.util.Scanner;

public class Praktikum3S1rev {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = in.nextInt();
        if (angka <= 1) {

        } else {
            if (angka % 2 == 0) {
                System.out.println(angka + " merupakan angka kelipatan 2 ");
            }
            if (angka % 3 == 0) {
                System.out.println(angka + " merupakan angka kelipatan 3 ");
            }
            if (angka % 4 == 0) {
                System.out.println(angka + " merupakan angka kelipatan 4 ");
            }
            if (angka % 5 == 0) {
                System.out.println(angka + " merupakan angka kelipatan 5 ");
            }
            if (angka % 6 == 0) {
                System.out.println(angka + " merupakan angka kelipatan 6 ");
            }
            if (angka % 7 == 0) {
                System.out.println(angka + " merupakan angka kelipatan 7 ");
            }
            if (angka % 8 == 0) {
                System.out.println(angka + " merupakan angka kelipatan 8 ");
            }
            if (angka % 9 == 0) {
                System.out.println(angka + " merupakan angka kelipatan 9 ");
            }

        }

    }

}
