package praktikum_soal;

import java.util.Scanner;

public class Praktikum6S4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int perulangan = 0, angka, min = 9999, max = -9999;
        double rerata = 0;
        String kondisi = "";
        System.out.println("Program nilai");

        do {
            System.out.print("Masukkan angka : ");
            angka = in.nextInt();
            System.out.print("Apakah ingin lanjut? (y/n) : ");
            in.nextLine();
            kondisi = in.nextLine();
            perulangan++;
            max = (max > angka) ? max : angka;
            min = (min < angka) ? min : angka;
            rerata += angka;
        } while (kondisi.equalsIgnoreCase("y"));
        System.out.println("Nilai Terendah  : " + min);
        System.out.println("Nilai Tertinggi : " + max);
        System.out.println("Rata rata Nilai : " + (rerata / perulangan));
    }

}
