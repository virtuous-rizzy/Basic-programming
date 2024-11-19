package praktikum_soal;

import java.util.Scanner;

public class Praktikum8S1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s, t, r;
        int menu = 0;
        System.out.print("Masukkan nilai sisi (s)      : ");
        s = in.nextDouble();
        System.out.print("Masukkan nilai Tinggi (t)    : ");
        t = in.nextDouble();
        System.out.print("Masukkan nilai Jari-jari (r) : ");
        r = in.nextDouble();

        while (true) {
            System.out.println(" 1. Menghitung luas persegi \n 2. Menghitung luas segitiga \n 3. Menghitung luas lingkaran \n 4. Keluar Program ");
            System.out.print("==>>> ");
            menu = in.nextInt();
            if (menu == 1) {
                System.out.println("Luas perseginya adalah " + luasPersegi(s));
            } else if (menu == 2) {
                System.out.println("Luas Segitiganya adalah " + luasSegitiga(s, t));
            } else if (menu == 3) {
                System.out.println("Luas Lingkaran adalah " + luasLingkaran(r));
            } else if (menu == 4) {
                System.exit(0);
                System.out.println("Terimakasih sudah menggunakan program ini.");
            }

        }
    }

    static double luasPersegi(double s) {
        double luasPersegi = s * s;
        return luasPersegi;
    }

    static double luasSegitiga(double s, double t) {
        double luasSegitiga = (s * t) / 2;
        return luasSegitiga;
    }

    static double luasLingkaran(double r) {
        double pi = 22 / 7;
        double luasLingkaran = pi * r * r;
        return luasLingkaran;
    }

}
