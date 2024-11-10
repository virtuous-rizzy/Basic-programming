package Method;

import java.util.Scanner;

public class NyobaFunctionMethod {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = in.nextLine();
        System.out.print("Tahun Lahir : ");
        int tahun = in.nextInt();
        System.out.println("");

        System.out.println("Umur " + nama + " adalah " + umur(tahun) + " tahun.");
    }

    static int umur(int tahun) {
        int umur = 2024 - tahun;
        return umur;
    }
}
