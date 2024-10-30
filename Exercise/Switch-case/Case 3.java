package BelajarPraktikum;

import java.util.Scanner;

public class StudiKasusSwitchListrik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tarif = 0, totalbiaya;
        System.out.println("================================================");
        System.out.println("\t PENGHITUNG TAGIHAN LISTRIK");
        System.out.print("Golongan Listrik (R1/R2/R3) : ");
        String gol = in.nextLine();
        System.out.print("Jumlah kWh                  : ");
        int kwh = in.nextInt();
        System.out.println("================================================");
        switch (gol.toUpperCase()) {
            case "R1":
                tarif = 1500;
                break;
            case "R2":
                tarif = 2000;
                break;
            case "R3":
                tarif = 2500;
                break;
            default:
                System.out.println("GOLONGAN LISTRIK TIDAK VALID");
                break;
        }

        if (kwh > 1000) {
            totalbiaya = (tarif * kwh) + 100000;
            System.out.println("Total biaya : Rp.  " + totalbiaya);
        } else if (kwh < 50) {
            totalbiaya = (tarif * kwh) - (tarif * kwh * 10 / 100);
            System.out.println("Total biaya : Rp. " + totalbiaya);
        } else {
            totalbiaya = tarif * kwh;
            System.out.println("Total biaya : Rp. " + totalbiaya);
        }
    }
}
