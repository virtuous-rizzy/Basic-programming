package praktikum_soal;

import java.util.Scanner;

public class Praktikum8S3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double perulangan = 0, angka, min = 9999, max = -9999;
        double rerata = 0;
        String kondisi = "";
        System.out.println("Program nilai");
        do {
            System.out.print("Masukkan angka : ");
            angka = in.nextInt();
            System.out.print("Apakah ingin lanjut? (y/n) : ");
            in.nextLine();
            kondisi = in.nextLine();
            rerata += angka;
            perulangan++;
            min = min(angka, max, min);
            max = max(angka, max, min);
        } while (cek(kondisi));
        System.out.println("Nilai Terendah  : " + min);
        System.out.println("Nilai Tertinggi : " + max);
        System.out.println("Rata rata Nilai : " + rerata(perulangan, rerata));
    }

    static double max(double angka, double max, double min) {
        max = (max > angka) ? max : angka;
        return max;
    }

    static double min(double angka, double max, double min) {
        min = (min < angka) ? min : angka;
        return min;
    }

    static double rerata(double perulangan, double rerata) {
        return rerata / perulangan;

    }

    static boolean cek(String kondisi) {
        return kondisi.equalsIgnoreCase("y");
    }
}
