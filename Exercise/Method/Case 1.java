package LatihanSoal;

import java.util.Scanner;

public class NyobaMethod1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        do {
            System.out.println("Pilih menu:\n1.Penambahan dan Pengurangan \n2.Bilangan Ganjil/Genap\n3.Bilangan positif / negatif / nol\n4.Berhenti ");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();

            System.out.println("=================================");
            if (menu == 1) {
                System.out.println("Penambahan dan pengurangan");
                menu1();
            } else if (menu == 2) {

                System.out.println("Bilangan Ganjil/Genap");
                menu2();
            } else if (menu == 3) {
                System.out.println("Bilangan Bilangan Positif / Negatif / nol");
                menu3();
            } else if (menu == 4) {
                System.out.println("Program Berhenti");
                i++;
            }
        } while (i < 2);

    }

    static void menu1() {
        Scanner ipt = new Scanner(System.in);
        System.out.print("Masukkan Bilangan pertama : ");
        int bil1 = ipt.nextInt();
        System.out.print("Masukkan Bilangan kedua : ");
        int bil2 = ipt.nextInt();
        int Ttambah = bil1 + bil2;
        int Tkurang = bil1 - bil2;
        System.out.println("hasil penambahan : " + Ttambah);
        System.out.println("hasil pengurangan : " + Tkurang);
    }

    static void menu2() {
        Scanner ipt = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int menu3 = ipt.nextInt();
        if (menu3 % 2 == 0) {
            System.out.println(menu3 + " adalah bilangan genap ");
        } else if (menu3 % 2 != 0) {
            System.out.println(menu3 + " adalah bilangan ganjil");

        }
        System.out.println("=================================");
    }

    static void menu3() {
        Scanner ipt = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int menu2 = ipt.nextInt();
        if (menu2 > 0) {
            System.out.println(menu2 + " adalah bilangan positif");
        } else if (menu2 < 0) {
            System.out.println(menu2 + " adalah bilangan negatif");
        } else if (menu2 == 0) {
            System.out.println(menu2 + " adalah bilangan nol");
        }
        System.out.println("=================================");
    }

}
