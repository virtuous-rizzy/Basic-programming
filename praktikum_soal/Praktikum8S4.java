package praktikum_soal;

import java.util.Scanner;

public class Praktikum8S4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celcius = 0, fahrenheit = 0, reamur = 0, kelvin = 0, suhu;

        System.out.println("=> Program Konversi Suhu <=");
        System.out.println("----------------------------");
        System.out.println("Pilih suhu yang ingin dikonversi :");
        System.out.println("  1. Celcius");
        System.out.println("  2. Fahrenheit");
        System.out.println("  3. Reamur");
        System.out.println("  4. Kelvin");
        System.out.println("----------------------------");
        System.out.print("Pilih jenis suhu: ");
        int jenis = in.nextInt();

        if (jenis == 1) {
            menu1();
        } else if (jenis == 2) {
            menu2();
        } else if (jenis == 3) {
            menu3();
        } else if (jenis == 4) {
            menu4();
        }

    }

    public static void menu1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai suhu: ");
        double celcius = in.nextDouble();
        System.out.println("\n----------------------------");
        System.out.println("Pilih tujuan konversi: ");
        System.out.println("  1. Ke Fahrenheit");
        System.out.println("  2. Ke Reamur");
        System.out.println("  3. Ke Kelvin");
        System.out.println("----------------------------");
        System.out.print("Pilih jenis suhu: ");
        int jenis2 = in.nextInt();

        switch (jenis2) {
            case 1:
                System.out.println("----------------------------");
                System.out.println("Hasil konversi celcius ke fahrenheit: " + ckef(celcius));
                break;
            case 2:
                System.out.println("----------------------------");
                System.out.println("Hasil konversi celcius ke reamur: " + cker(celcius));
                break;
            case 3:
                System.out.println("----------------------------");
                System.out.println("Hasil konversi celcius ke kelvin: " + ckek(celcius));
                break;
        }
    }

    public static void menu2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai suhu: ");
        double fahrenheit = in.nextDouble();
        System.out.println("\n----------------------------");
        System.out.println("Pilih tujuan konversi: ");
        System.out.println("  1. Ke Celcius");
        System.out.println("  2. Ke Reamur");
        System.out.println("  3. Ke Kelvin");
        System.out.println("----------------------------");
        System.out.print("Pilih jenis suhu: ");
        int jenis2 = in.nextInt();

        switch (jenis2) {
            case 1:
                System.out.println("----------------------------");
                System.out.println("Hasil konversi fahrenheit ke celcius: " + fkec(fahrenheit));
                break;
            case 2:
                System.out.println("----------------------------");
                System.out.println("Hasil konversi fahrenheit ke reamur: " + fker(fahrenheit));
                break;
            case 3:
                System.out.println("----------------------------");
                System.out.println("Hasil konversi fahrenheit ke kelvin: " + fkek(fahrenheit));
                break;
        }
    }

    public static void menu3() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai suhu: ");
        double reamur = in.nextDouble();
        System.out.println("\n----------------------------");
        System.out.println("Pilih tujuan konversi: ");
        System.out.println("  1. Ke Celcius");
        System.out.println("  2. Ke Fahrenheit");
        System.out.println("  3. Ke Kelvin");
        System.out.println("----------------------------");
        System.out.print("Pilih jenis suhu: ");
        int jenis2 = in.nextInt();
        switch (jenis2) {
            case 1:
                System.out.println("----------------------------");
                System.out.println("Hasil konversi reamur ke celcius: " + rkec(reamur));
                break;
            case 2:
                System.out.println("----------------------------");
                System.out.println("Hasil konversi reamur ke fahrenheit: " + rkef(reamur));
                break;
            case 3:
                System.out.println("----------------------------");
                System.out.println("Hasil konversi reamur ke kelvin: " + rkek(reamur));
                break;
        }
    }

    public static void menu4() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai suhu: ");
        double kelvin = in.nextDouble();
        System.out.println("\n----------------------------");
        System.out.println("Pilih tujuan konversi: ");
        System.out.println("  1. Ke Celcius");
        System.out.println("  2. Ke Fahrenheit");
        System.out.println("  3. Ke Reamur");
        System.out.println("----------------------------");
        System.out.print("Pilih jenis suhu: ");
        int jenis2 = in.nextInt();
        switch (jenis2) {
            case 1:
                System.out.println("----------------------------");
                System.out.println("Hasil konversi kelvin ke celcius: " + kkec(kelvin));
                break;
            case 2:
                System.out.println("----------------------------");
                System.out.println("Hasil konversi kelvin ke fahrenheit: " + kkef(kelvin));
                break;
            case 3:
                System.out.println("----------------------------");
                System.out.println("Hasil konversi kelvin ke reamur: " + kker(kelvin));
                break;
        }
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
