package praktikum_soal;

import java.util.Scanner;
public class Praktikum2S3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bil1,bil2,bil3,bil4,rata_rata;
        
        System.out.print("Bilangan 1 : ");
        bil1 = in.nextDouble();
        System.out.print("Bilangan 2 : ");
        bil2 = in.nextDouble();
        System.out.print("Bilangan 3 : ");
        bil3 = in.nextDouble();
        System.out.print("Bilangan 4 : ");
        bil4 = in.nextDouble();
        
        rata_rata = (bil1 + bil2 +bil3+bil4) /4;
        System.out.println("Maka rata rata dari bilangan diatas adalah " + rata_rata);

    }
}
