package praktikum_soal;

import java.util.Scanner;

public class Praktikum2S1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double a,b,tinggi,hasil;
        
            System.out.println("Masukkan nilai - nilainya !");
            System.out.print("Nilai sisi a : ");
            a = in.nextDouble();
            System.out.print("Nilai sisi b : ");
            b = in.nextDouble();
            System.out.print("Nilai tinggi : ");
            tinggi = in.nextDouble();
            
            hasil = (a+b)/2 * tinggi;
            System.out.println("Maka Luas trapesium adalah " + hasil);
    }
    
}
