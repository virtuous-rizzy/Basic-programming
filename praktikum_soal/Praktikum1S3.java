package praktikum_soal;

import java.util.Scanner;

public class Praktikum1S3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Data Diri Anda ! ");
        String nama,ps,nim;
        
        System.out.print("Nama          : ");
        nama = in.nextLine();
        System.out.print("NIM           : ");
        nim = in.nextLine();
        System.out.print("Program Studi : ");
        ps = in.nextLine();
        
            System.out.println("Selamat ! " + nama + " , Anda telah terdaftar dengan nim " + nim + " di program studi " + ps);
    }
    
}
