package praktikum_soal;

import java.util.Scanner;

public class Praktikum4S4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int harga=0;
        System.out.println("==============================");
        System.out.println("\t MENU MAKANAN");
        System.out.println("1.Nasi Samin      (Rp 11.000)");
        System.out.println("2.Nasi Goreng     (Rp 12.000)");
        System.out.println("3.Nasi Kuning Ayam(Rp 13.000)");
        System.out.print("Pilih makanan : ");
        String menu1 = in.nextLine();
        
        switch (menu1){
            case "1":
                harga += 11000;
                break;
            case "2":
                harga += 12000;
                break;
            case "3":
                harga += 13000;
                break;
            default :
                System.out.println("Tidak memilih Makanan");
        }
        System.out.println("==============================");
        System.out.println("\t MENU MINUMAN");
        System.out.println("1.Es Teh          (Rp 3.000)");
        System.out.println("2.Es Sirup        (Rp 3.000)");
        System.out.println("3.Es jeruk        (Rp 5.000)");
        System.out.print("Pilih minuman : ");
        String menu2 = in.nextLine();
        
        switch (menu2){
            case "1":
                harga += 3000;
                break;
            case "2":
                harga += 3000;
                break;
            case "3":
                harga += 5000;
                break;
            default :
                System.out.println("Tidak memilih minuman");
        }
        System.out.println("==============================");
        System.out.println("Total harga : " + harga);
        System.out.println("==============================");




    }
}
