package LatihanSoal;

import java.util.Scanner;

public class PercabanganSoal3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double lp, bt, kp, sp, total;
        int laptop, buku, kotak, smartphone;
        System.out.print("Masukkan jumlah laptop       : ");
        laptop = in.nextInt();
        System.out.print("Masukkan jumlah Buku Tulis   : ");
        buku = in.nextInt();
        System.out.print("Masukkan jumlah Kotak Pensil : ");
        kotak = in.nextInt();
        System.out.print("Masukkan jumlah smartphone   : ");
        smartphone = in.nextInt();

        System.out.println("===========Indeks Barang bawaan=========");
        System.out.println("Laptop       : " + laptop);
        System.out.println("Buku Tulis   : " + buku);
        System.out.println("Kotak Pensil : " + kotak);
        System.out.println("Smartphone   : " + smartphone);
        System.out.println("========================================");
        lp = laptop * 850.56;
        bt = buku * 250.11;
        kp = kotak * 25.31;
        sp = smartphone * 200.00;
        total = lp + bt + kp + sp;
        if (lp < 0 || bt < 0 || kp < 0 || sp < 0) {
            System.out.println("ERROR, BARANG TIDAK BOLEH BERJUMLAH NEGATIF");
        } else if (total >= 2000) {
            System.out.println("Indeks Berat Barang : 5");
        } else if (total >= 1500 && total <= 2000) {
            System.out.println("Indeks Berat Barang : 4");
        } else if (total >= 1000 && total < 1500) {
            System.out.println("Indeks Berat Barang : 3");
        } else if (total >= 500 && total < 1000) {
            System.out.println("Indeks Berat Barang : 2");
        } else if (total > 0 && total < 500) {
            System.out.println("Indeks Berat Barang : 1");
        } else if (total == 0) {
            System.out.println("Indeks Berat Barang : 0");
        } else if (total > 2000) {
            System.out.println("berat barang melebihi batas");
        } else if (total < 0) {
            System.out.println("Berat barang dibawah batas");
        }
    }
}
