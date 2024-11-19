package praktikum_soal;

import java.util.Scanner;

public class Praktikum7S4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bil = in.nextInt();
        prima(bil);

    }

    static void prima(int bil) {
        int nomor = bil;
        boolean kondisi = false;
        for (int i = 2; i <= nomor / 2; i++) {
            if (nomor % i == 0) {
                kondisi = true;
                break;
            }
        }
        if (bil <= 1) {
            System.out.println("bilangan tersebut bukan prima!");
        } else {
            if (!kondisi) {
                System.out.println("bilangan tersebut prima!");
            } else {
                System.out.println("bilangan tersebut bukan prima!");
            }
        }
    }
}
