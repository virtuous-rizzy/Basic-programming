package Method;

import java.util.Scanner;

public class FunctionKeuangan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlah = 100000, pemasukan, pengeluaran;
        String keterangan = "Saldo anda saat ini adalah ";
        while (true) {
            System.out.println("===================================");
            System.out.println("    Aplikasi Manajemen Keuangan ");
            System.out.println("===================================\n");

            System.out.println("1. Simpan Saldo");
            System.out.println("2. Tarik Saldo");
            System.out.println("3. Tampilkan Saldo");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu : ");
            int menu = in.nextInt();
            switch (menu) {
                case 1:
                    jumlah = Pemasukan(jumlah);
                    System.out.println(keterangan + jumlah);
                    break;
                case 2:
                    jumlah = Pengeluaran(jumlah);
                    System.out.println(keterangan + jumlah);
                    break;
                case 3:
                    System.out.println(keterangan + jumlah);
                    break;
                case 4:
                    tulisan("Terimakasih sudah menggunakan aplikasi ini.");
                    System.exit(0);
                    break;
                default:
                    tulisan("Maaf saldo anda kurang !");
                    break;
            }
        }
    }

    static void tulisan(Object input) {
        System.out.println(input);
    }

    static int Pemasukan(int jumlah) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah Pemasukan : ");
        int pemasukan = in.nextInt();

        jumlah += pemasukan;
        return jumlah;
    }

    static int Pengeluaran(int jumlah) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah Pengeluaran : ");
        int pengeluaran = in.nextInt();

        if (pengeluaran > jumlah) {
            System.out.println("Maaf saldo anda kurang !");
            return jumlah;
        }

        jumlah -= pengeluaran;
        return jumlah;
    }
}
