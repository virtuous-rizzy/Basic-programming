package praktikum_soal;

import java.util.Scanner;

public class Praktikum6S2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu = 0;
        System.out.println("Program Perulangan");
        do {
            System.out.println("1. Lanjut \n2. Berhenti ");
            System.out.print("Pilih menu : ");
            menu = in.nextInt();
            if (menu == 1) {
                System.out.println("Lanjut!");
            } else if (menu == 2) {
                System.out.println("Program Berhenti");
                break;
            } else {
                System.out.println("Menu invalid!");
            }
        } while (menu < 2);
    }
}
