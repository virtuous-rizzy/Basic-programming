package Method;

import java.util.Scanner;

public class NyobaMethod2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bil = 0;
        System.out.print("Masukkan Bilangan : ");
        bil = in.nextInt();
        prima(bil);
        fibon(bil);

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
        if (!kondisi) {
            System.out.println(bil + " adalah bilangan prima");
        } else {
            System.out.println(bil + " bukan bilangan prima");
        }

    }

    static void fibon(int bil) {
        int a = 1, b = 1;
        if (bil == a || bil == b) {
            System.out.println(bil + " adalah bilangan Fibonacci");
            return;
        }

        int fibo = a + b;
        while (fibo <= bil) {
            if (fibo == bil) {
                System.out.println(bil + " adalah bilangan Fibonacci");
                return;
            }

            a = b;
            b = fibo;
            fibo = a + b;
        }
        System.out.println(bil + " bukan bilangan Fibonacci");
    }
}
