package praktikum_soal;

import java.util.Scanner;

public class Praktikum5S3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bilangan prima : ");
        System.out.print("");
        int atas = input.nextInt();

        System.out.print("");
        int bawah = input.nextInt();

        int prima = 0;

        for (int i = atas; i <= bawah; i++) {
            int bilangan = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    bilangan += 1;
                }
            }
            if (bilangan == 2) {
                System.out.print(i + " ");
                prima++;
            }
        }
        System.out.println("\nJumlah prima: " + prima);
    }
}
