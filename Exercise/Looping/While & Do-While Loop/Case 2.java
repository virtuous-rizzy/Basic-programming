package Perulangan;

import java.util.Scanner;

public class WhileLoopTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean kondisi = true;
        int count = 0;
        String jawab;
        while (kondisi) {
            System.out.println("Apakah anda ingin berhenti?");
            System.out.print("Ya/tidak : ");
            jawab = in.nextLine();
            if (jawab.equalsIgnoreCase("ya")) {
                kondisi = false;
            }
            count++;
        }
        System.out.println("Anda sudah mengulang sebanyak : " + count);
    }

}
