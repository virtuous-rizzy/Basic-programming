package praktikum_soal;

import java.util.Scanner;

public class Praktikum7S2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s, t, r;
        int menu = 0;
        boolean kondisi = true;
        System.out.print("Masukkan nilai sisi (s)      : ");
        s = in.nextDouble();
        System.out.print("Masukkan nilai Tinggi (t)    : ");
        t = in.nextDouble();
        System.out.print("Masukkan nilai Jari-jari (r) : ");
        r = in.nextDouble();

        do {
            System.out.println(" 1. Menghitung luas persegi \n 2. Menghitung luas segitiga \n 3. Menghitung luas lingkaran \n 4. Keluar Program ");
            System.out.print("==>>> ");
            menu = in.nextInt();
            if (menu == 1) {
                menu1(s);
            } else if (menu == 2) {
                menu2(s, t);
            } else if (menu == 3) {
                menu3(r);
            } else if (menu == 4) {
                menu4();
                kondisi = false;
            }

        } while (kondisi);
    }

    static void menu1(double s) {
        double luasPersegi = s * s;
        System.out.println("Luas perseginya adalah " + luasPersegi);

    }

    static void menu2(double s, double t) {
        double luasSegitiga = (s * t) / 2;
        System.out.println("Luas Segitiganya adalah " + luasSegitiga);
    }

    static void menu3(double r) {
        double pi = 22 / 7;
        double luasLingkaran = pi * r * r;
        System.out.println("Luas Lingkaran adalah " + luasLingkaran);
    }

    static void menu4() {
        System.out.println("Program berhenti");
    }
}
