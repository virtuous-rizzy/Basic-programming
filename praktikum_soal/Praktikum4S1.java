
package praktikum_soal;

import java.util.Scanner;

public class Praktikum4S1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float cel,rea,fahre,kel;
        System.out.println("==================================");
        System.out.println("PROGRAM KONVERTER SUHU CELCIUS");
        System.out.println("1. Konversi ke Reamur");        
        System.out.println("2. Konversi ke Fahrenheit");
        System.out.println("3. Konversi ke Kelvin");
        System.out.print("Pilih menu : ");
        int pil = in.nextInt();
        System.out.println("==================================");

        switch (pil) {
            case 1 :
                System.out.print("Input suhu (°C) : ");
                cel = in.nextFloat();
                rea = cel * 4 / 5;
                System.out.println("Output suhu (°R) : " + rea);
                break;
            case 2 :
                System.out.print("Input suhu (°C) : ");
                cel = in.nextFloat();
                fahre = (cel * 9 /5 ) + 32 ;
                System.out.println("Output suhu (°F) : " + fahre);
                break;
            case 3 :
                System.out.print("Input suhu (°C) : ");
                cel = in.nextFloat();
                kel = cel + 273;
                System.out.println("Output suhu (K) : " + kel);
                break;
            default :
                System.err.println("PILIHAN TIDAK VALID");
                break;

        
        }
    }
}
