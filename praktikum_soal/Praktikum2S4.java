package praktikum_soal;

import java.util.Scanner;
public class Praktikum2S4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in); 
        double jari2,hasil;
        final double pi = 3.141592;
        
        System.out.println("Masukkan nilai nilainya ! ");
        System.out.print("Masukkan jari - jarinya : ");
        jari2 = in.nextDouble();
         hasil = pi * jari2 * jari2;
         
         double hasilFix = Math.round(hasil);
            System.out.println("Maka Luas dari Lingkaran tersebut adalah " + hasilFix);
    }
}
