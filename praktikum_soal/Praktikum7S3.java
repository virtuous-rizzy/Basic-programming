package praktikum_soal;

import java.util.Scanner;

public class Praktikum7S3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean kondisi = true;
        boolean input = false;
        int a = 0, b = 0, n = 0;
        do {
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
                        menu2(a, b, n);
                    } else {
                        System.out.println("Anda harus menginput nilai!");
                    }
                    break;
                case 3:
                    if (input) {
                        menu3(a, b, n);
                    } else {
                        System.out.println("Anda harus menginput nilai!");
                    }
                    break;
                case 4:
                    kondisi = false;
                    System.out.println("Program berhenti.");
                    break;
            }

        } while (kondisi);

    }

    static void menu2(int a, int b, int n) {
        int sukuN = a + (n - 1) * b;
        System.out.println("Suku ke- " + n + " adalah " + sukuN);
    }

    static void menu3(int a, int b, int n) {
        int jmlN = n / 2 * (2 * a + (n - 1) * b);
        System.out.println("Jumlah suku ke-" + n + " adalah " + jmlN);
    }
}
