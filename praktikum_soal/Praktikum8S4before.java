package praktikum_soal;

import java.util.Scanner;

public class Praktikum8S4before {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celcius, reamur, fahren, kelvin, suhu;
        System.out.println("PROGRAM KONVERSI SUHU ");
        System.out.println("----------------------");
        menuTampilan1();

        System.out.print("Pilih jenis suhu : ");
        int jenissuhu = in.nextInt();
        System.out.print("Masukkan nilai suhu : ");
        suhu = in.nextDouble();
        System.out.println("----------------------");

        switch (jenissuhu) {
            case 1:
                System.out.println("Pilih tujuan dikonversi : ");
                System.out.println(" 1. Fahrenheit \n 2. Reamur \n 3. Kelvin");
                System.out.println("----------------------");
                System.out.print("Pilih jenis suhu : ");
                int jenissuhu2 = in.nextInt();
                break;
            case 2:
                System.out.println("Pilih tujuan dikonversi : ");
                System.out.println(" 1. Fahrenheit \n 2. Reamur \n 3. Kelvin");
                System.out.println("----------------------");
                System.out.print("Pilih jenis suhu : ");
                jenissuhu2 = in.nextInt();
                break;
            case 3:
                System.out.println("Pilih tujuan dikonversi : ");
                System.out.println(" 1. Fahrenheit \n 2. Reamur \n 3. Kelvin");
                System.out.println("----------------------");
                System.out.print("Pilih jenis suhu : ");
                jenissuhu2 = in.nextInt();

                break;
            case 4:
                System.out.println("Pilih tujuan dikonversi : ");
                System.out.println(" 1. Fahrenheit \n 2. Reamur \n 3. Kelvin");
                System.out.println("----------------------");
                System.out.print("Pilih jenis suhu : ");
                jenissuhu2 = in.nextInt();
                break;
        }
    }

    static void menuTampilan1() {
        System.out.println("Pilih suhu yang ingin dikonversi : ");
        System.out.println(" 1. Celcius \n 2. Fahrenheit \n 3. Reamur \n 4. Kelvin");
        System.out.println("----------------------");

    }

    public static double ckef(double celcius) {
        return celcius * 9 / 5 + 32;
    }

    public static double cker(double celcius) {
        return celcius * 4 / 5;
    }

    public static double ckek(double celcius) {
        return celcius + 273.15;
    }

    public static double fkec(double fahren) {
        return (fahren - 32) * 5 / 9;
    }

    public static double fker(double fahren) {
        return 4 / 9 * (fahren - 32);
    }

    public static double fkek(double fahren) {
        return (fahren + 459.67) * 5 / 9;
    }

    public static double kkec(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kkef(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }

    public static double kker(double kelvin) {
        return 4 / 5 * (kelvin - 273);
    }

    public static double rkec(double reamur) {
        return reamur * 1.25;
    }

    public static double rkef(double reamur) {
        return (reamur * 2.25) + 32;
    }

    public static double rkek(double reamur) {
        return (reamur / 0.8) + 273.15;
    }
}
