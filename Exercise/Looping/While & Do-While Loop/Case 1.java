package Perulangan;

import java.util.Scanner;

public class TabelPerkalianWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1, hasil = 0, total = 0;

        System.out.print("Tabel perkalian : ");
        int angka = in.nextInt();

        while (i <= 10) {
            hasil = i * angka;
            System.out.println(angka + " x " + i + " = " + hasil);
            i++;
            total += hasil;
        }
        System.out.println("Total seluruh hasil perkalian : " + total);
    }
}
