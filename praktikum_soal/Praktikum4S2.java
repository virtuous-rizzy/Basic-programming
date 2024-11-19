package praktikum_soal;

import java.util.Scanner;

public class Praktikum4S2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nilai,nama;
        System.out.println("================================");
        System.out.println("PROGRAM CEK GRADE MAHASISWA");
        System.out.print("Nama   : ");
        nama = in.nextLine();
        System.out.print("Nilai  : ");
        nilai = in.nextLine();
        
        switch (nilai.toLowerCase()){
            case "a" :
                System.out.println("Excellent");
                break;
            case "b" :
                System.out.println("Good");
                break;
            case "c" :
                System.out.println("Average");
                break;
            case "d" :
                System.out.println("Below Average");
                break;
            case "e" :
                System.out.println("Fail");
                break;
            default :
        }
        System.out.println("================================");
    }
    
}
