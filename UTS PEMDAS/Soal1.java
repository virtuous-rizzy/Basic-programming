package uts;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("\t LOGIN");
        System.out.print("Username : ");
        String user = in.nextLine();
        System.out.print("Password : ");
        String pass = in.nextLine();
        System.out.println("==========================");

        if (user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("rahasia")) {
            System.out.println("LOGIN BERHASIL!");
        } else {
            System.out.println("LOGIN GAGAL!");
        }
    }
}
