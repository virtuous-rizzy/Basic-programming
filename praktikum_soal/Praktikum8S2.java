package praktikum_soal;

import java.util.Scanner;

public class Praktikum8S2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean input = false;
        int a = 0, b = 0, n = 0;
        while (true) {
            int menu = 0;
            System.out.println(" 1. Input nilai a,b, dan n \n 2. Menghitung suku ke-n \n 3. Menghitung jumlah n suku pertama \n 4. Keluar program");
            System.out.print("=>> ");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Nilai a : ");
                    a = in.nextInt();
                    System.out.print("Nilai b : ");
                    b = in.nextInt();
                    System.out.print("Nilai n : ");
                    n = in.nextInt();
                    input = true;
                    break;
                case 2:
                    if (input) {
                        System.out.println("Suku ke- " + n + " adalah " + sukuN(a, b, n));
                    } else {
                        System.out.println("Anda harus menginput nilai!");
                    }
                    break;
                case 3:
                    if (input) {
                        System.out.println("Jumlah suku ke-" + n + " adalah " + jumlahSukuN(a, b, n));
                    } else {
                        System.out.println("Anda harus menginput nilai!");
                    }
                    break;
                case 4:
                    System.exit(0);
                    System.out.println("Program berhenti.");
            }

        }
    }

    public static int sukuN(int a, int b, int n) {
        int sukuN = a + (n - 1) * b;
        return sukuN;

    }

    public static int jumlahSukuN(int a, int b, int n) {
        int jumlahSukuN = n / 2 * (2 * a + (n - 1) * b);
        return jumlahSukuN;
    }
}
