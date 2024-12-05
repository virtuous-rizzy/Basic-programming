package praktikum_soal;

import java.util.Scanner;

public class Praktikum8S4rev {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celcius, reamur, fahren, kelvin, suhu, konversi;
        System.out.println("PROGRAM KONVERSI SUHU ");
        System.out.println("----------------------");
        menuTampilan();

        System.out.print("Pilih jenis suhu : ");
        int jenissuhu = in.nextInt();

        switch (jenissuhu) {
            case 1:
                System.out.print("Masukkan nilai suhu : ");
                suhu = in.nextDouble();
                System.out.println("----------------------");
                menu1();
                int suhutujuan = in.nextInt();

                if (suhutujuan == 1) {
                    konversi = celciuskefahre(suhu);
                    System.out.println("Hasil konversi celcius ke fahrenheit adalah " + konversi + " F");
                } else if (suhutujuan == 2) {
                    konversi = celciuskerea(suhu);
                    System.out.println("Hasil konversi celcius ke reamur adalah " + konversi + " R");
                } else if (suhutujuan == 3) {
                    konversi = celciuskekelvin(suhu);
                    System.out.println("Hasil konversi celcius ke kelvin adalah " + konversi + " K");
                }
                break;
            case 2:
                System.out.print("Masukkan nilai suhu : ");
                suhu = in.nextDouble();
                System.out.println("----------------------");
                menu2();
                suhutujuan = in.nextInt();
                if (suhutujuan == 1) {
                    konversi = fahrekecelcius(suhu);
                    System.out.println("Hasil konversi fahrenheit ke celcius adalah " + konversi + " C");
                } else if (suhutujuan == 2) {
                    konversi = fahrekerea(suhu);
                    System.out.println("Hasil konversi fahrenheit ke reamur adalah " + konversi + " R");
                } else if (suhutujuan == 3) {
                    konversi = fahrekekelvin(suhu);
                    System.out.println("Hasil konversi fahrenheit ke kelvin adalah " + konversi + " K");
                }
                break;
            case 3:
                System.out.print("Masukkan nilai suhu : ");
                suhu = in.nextDouble();
                System.out.println("----------------------");
                menu3();
                suhutujuan = in.nextInt();
                if (suhutujuan == 1) {
                    konversi = reakefahre(suhu);
                    System.out.println("Hasil konversi reamur ke fahrenheit adalah " + konversi + " F");
                } else if (suhutujuan == 2) {
                    konversi = reakecelcius(suhu);
                    System.out.println("Hasil konversi reamur ke celcius adalah " + konversi + " C");
                } else if (suhutujuan == 3) {
                    konversi = reakekelvin(suhu);
                    System.out.println("Hasil konversi reamur ke kelvin adalah " + konversi + " K");
                }
                break;
            case 4:
                System.out.print("Masukkan nilai suhu : ");
                suhu = in.nextDouble();
                System.out.println("----------------------");
                menu4();
                suhutujuan = in.nextInt();
                if (suhutujuan == 1) {
                    konversi = kelvinkefahre(suhu);
                    System.out.println("Hasil konversi kelvin ke fahrenheit adalah " + konversi + " F");
                } else if (suhutujuan == 2) {
                    konversi = kelvinkerea(suhu);
                    System.out.println("Hasil konversi kelvin ke reamur adalah " + konversi + " R");
                } else if (suhutujuan == 3) {
                    konversi = kelvinkecelcius(suhu);
                    System.out.println("Hasil konversi kelvin ke celcius adalah " + konversi + " C");
                }
                break;
            default:
                System.err.println("Menu invalid");
                break;
        }
    }

    public static void menuTampilan() {
        System.out.println("Pilih suhu yang ingin dikonversi : ");
        System.out.println(" 1. Celcius \n 2. Fahrenheit \n 3. Reamur \n 4. Kelvin");
        System.out.println("----------------------");

    }

    public static void menu1() {
        System.out.println("Pilih tujuan dikonversi : ");
        System.out.println(" 1. Fahrenheit \n 2. Reamur \n 3. Kelvin");
        System.out.println("----------------------");
        System.out.print("Pilih jenis suhu : ");
    }

    public static void menu2() {
        System.out.println("Pilih tujuan dikonversi : ");
        System.out.println(" 1. Celcius \n 2. Reamur \n 3. Kelvin");
        System.out.println("----------------------");
        System.out.print("Pilih jenis suhu : ");
    }

    public static void menu3() {
        System.out.println("Pilih tujuan dikonversi : ");
        System.out.println(" 1. Fahrenheit \n 2. Celcius \n 3. Kelvin");
        System.out.println("----------------------");
        System.out.print("Pilih jenis suhu : ");
    }

    public static void menu4() {
        System.out.println("Pilih tujuan dikonversi : ");
        System.out.println(" 1. Fahrenheit \n 2. Reamur \n 3. Celcius");
        System.out.println("----------------------");
        System.out.print("Pilih jenis suhu : ");
    }

    public static double celciuskefahre(double celcius) {
        return celcius * 9 / 5 + 32;
    }

    public static double celciuskerea(double celcius) {
        return celcius * 4 / 5;
    }

    public static double celciuskekelvin(double celcius) {
        return celcius + 273.15;
    }

    public static double fahrekecelcius(double fahren) {
        return (fahren - 32) * 5 / 9;
    }

    public static double fahrekerea(double fahren) {
        return 4 / 9 * (fahren - 32);
    }

    public static double fahrekekelvin(double fahren) {
        return (fahren + 459.67) * 5 / 9;
    }

    public static double kelvinkecelcius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinkefahre(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }

    public static double kelvinkerea(double kelvin) {
        return 4 / 5 * (kelvin - 273);
    }

    public static double reakecelcius(double reamur) {
        return reamur * 1.25;
    }

    public static double reakefahre(double reamur) {
        return (reamur * 2.25) + 32;
    }

    public static double reakekelvin(double reamur) {
        return (reamur / 0.8) + 273.15;
    }
}
