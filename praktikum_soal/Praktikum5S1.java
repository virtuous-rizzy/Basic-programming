package praktikum_soal;

import java.util.Scanner;

public class Praktikum5S1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, total = 0, hasil = 0;
        System.out.print("Tabel perkalian : ");
        int angka = in.nextInt();

        for (i = 1; i <= 10; i++) {
            hasil = i * angka;
            System.out.print(angka + " x " + i + " = ");
            for (int j = 1; j <= 1; j++) {
                System.out.print(hasil);
                total += hasil;
            }
            System.out.println("");
        }
        System.out.println("Total seluruh hasil perkalian adalah : " + total);
    }
}
