package praktikum_soal;

import java.util.Scanner;

public class Praktikum5S2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ayam, i;
        System.out.print("Jumlah anak ayam : ");
        ayam = in.nextInt();
        System.out.println("Tek kotek kotek, anak ayam turun berkotek");
        for (i = ayam; i > 1; i--) {
            System.out.println("Anak ayam turunlah " + i + " , mati satu tinggalah " + (i - 1));

        }
        System.out.println("Anak ayam turunlah " + i + " , matilah satu tinggalah induknya");
    }
}