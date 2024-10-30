package BelajarPraktikum;

import java.util.Scanner;

public class Belajar2Cabang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String user, pass;

        System.out.println("--------<<<< LOGIN >>>>-------");
        System.out.print("Username = ");
        user = in.nextLine();
        System.out.print("Password = ");
        pass = in.nextLine();
        if (!user.equals("admin") && pass.equals("rahasia")) {
            System.out.println("SELAMAT ANDA BERHASIL LOGIN");
        } else {
            System.out.println("MAAF ANDA TIDAK BISA LOGIN");
        }
    }
}
