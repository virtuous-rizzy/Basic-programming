package praktikum_soal;

import java.util.Scanner;
public class Praktikum2S2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bil1;
            System.out.print("Masukkan Bilangan : ");
            bil1 = in.nextInt();
            String kondisi = bil1 % 3 == 0 ? "Adalah" : "Bukan";
            System.err.println("Bilangan " + bil1 +" " + kondisi + " kelipatan 3 ");
            
    }
}
