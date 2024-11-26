package Method;

import java.util.Scanner;

public class BankMethod {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int saldo = 100000, jmlUang;
        System.out.println("Selamat datang di Bank Unan");
        System.out.println("Saldo saat ini : Rp " + saldo);

        System.out.print("Simpan uang : Rp ");
        jmlUang = in.nextInt();
        saldo = simpanUang(saldo, jmlUang);

        System.out.println("Saldo saat ini : Rp " + saldo);
        System.out.print("Ambil uang : Rp ");
        jmlUang = in.nextInt();

        if (jmlUang <= saldo) {
            saldo = ambilUang(saldo, jmlUang);
        } else {
            int pinalti = 0;
            System.out.println("Saldo tidak mencukupi");
            System.out.println("Saldo anda berkurang sebanyak Rp " + PinaltiUang(saldo, pinalti));
            saldo -= PinaltiUang(saldo, pinalti);
        }

        System.out.println("Saldo saat ini : Rp " + saldo);
    }

    static int simpanUang(int saldo, int jmlUang) {
        saldo += jmlUang;
        return saldo;
    }

    static int ambilUang(int saldo, int jmlUang) {
        saldo -= jmlUang;
        return saldo;
    }

    static int PinaltiUang(int saldo, int pinalti) {
        pinalti = saldo * 10 / 100;
        return pinalti;
    }

}
