package praktikum_soal;

import java.util.Scanner;

public class Praktikum6S3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int melati;

        System.out.print("Masukkan sebuah angka : ");
        melati = in.nextInt();

        while (melati > 1) {
            System.out.println("Bunga melati mekarlah " + melati + ", layu 1 tinggallah " + (melati - 1));
            melati--;
        }
        System.out.println("Bunga melati mekarlah " + melati + ", layu 1 habis semua");
    }
}
