package Perulangan;

import java.util.Scanner;

public class LatihanPerulanganRerata {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, jumlahAngka, angka = 0;
        double hasiljumlah = 0;

        System.out.print("Jumlah angka yang ingin dimasukkan : ");
        jumlahAngka = in.nextInt();

        for (i = 1; i <= jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + i + " : ");
            angka = in.nextInt();
            hasiljumlah += angka;
        }
        double rerata = hasiljumlah / jumlahAngka;
        System.out.println("Rerata Angka adalah : " + rerata);

    }

}
