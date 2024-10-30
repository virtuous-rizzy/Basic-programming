package Perulangan;

import java.util.Scanner;

public class LatihanSoal1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double angka, Tangka, i, min = 9999, max = -9999, jumlah = 0, rata;

        System.out.print("Masukkan jumlah angka : ");
        angka = in.nextDouble();

        for (i = 1; i <= angka; i++) {
            System.out.print("Masukkan angka ke " + i + " : ");
            Tangka = in.nextDouble();
            jumlah += Tangka;

            if (max < Tangka) {
                max = Tangka;
                if (min > Tangka) {
                    min = Tangka;
                }
            }
        }
        rata = jumlah / angka;
        System.out.println("==========================");
        System.out.println("Nilai terkecil  : " + min);
        System.out.println("Nilai terbesar  : " + max);
        System.out.println("Rata rata nilai : " + rata);

    }

}
