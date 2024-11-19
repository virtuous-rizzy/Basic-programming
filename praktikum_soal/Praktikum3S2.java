package praktikum_soal;
import java.util.Scanner;
public class Praktikum3S2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int tb,diskon,tbayar;
        String kartu;
        System.out.println("------Toko Tokoan------");
        System.out.print("Apakah anda punya kartu member (y/n) : ");
        kartu = in.nextLine();
        System.out.print("Masukkan total belanjaan : ");
        tb = in.nextInt();
        if (kartu.equalsIgnoreCase("y")){
            if (tb > 500000){
            tbayar = (tb * (100 - 8)/ 100);
                System.out.println("Total bayar setelah diskon : " + tbayar);
            }
            else if (tb > 100000){
            tbayar = (tb *(100 - 4) / 100);
                System.out.println("Total bayar setelah diskon : " + tbayar);
            }
            else {
                System.out.println("Total bayar setelah diskon : " + tb);
            }
        }
        else {
            if (tb > 100000) {
                tbayar =(tb * (100-2)/ 100);
                System.out.println("Total bayar setelah diskon : " + tbayar);
            }
            else if(tb <= 100000) {
                System.out.println("Total bayar setelah diskon : " + tb);
            }
        }
    }
}
