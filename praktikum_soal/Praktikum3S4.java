package praktikum_soal;
import java.util.Scanner;
public class Praktikum3S4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int angka1,angka2;
                System.out.print("Operasi hitung yang ingin dilakukan ?\n(Penjumlahan/Pengurangan/Perkalian/Pembagian): ");
        String input = in.nextLine();
        
        if(input.equalsIgnoreCase("Penjumlahan")){
            System.out.print("Masukkan angka pertama: ");
            angka1 = in.nextInt();
            System.out.print("Masukkan angka kedua: ");
            angka2 = in.nextInt();
            int hasil = angka1 + angka2;
            System.out.println("Hasilnya adalah: " + hasil);
        }
        else if(input.equalsIgnoreCase("Pengurangan")){
            System.out.print("Masukkan angka pertama: ");
            angka1 = in.nextInt();
            System.out.print("Masukkan angka kedua: ");
            angka2 = in.nextInt();
            int hasil = angka1 - angka2;
            System.out.println("Hasilnya : " + hasil);
        }
        else if(input.equalsIgnoreCase("Perkalian")){
            System.out.print("Masukkan angka pertama: ");
            angka1 = in.nextInt();
            System.out.print("Masukkan angka kedua: ");
            angka2 = in.nextInt();
            int hasil = angka1 * angka2;
            System.out.println("Hasilnya adalah: " + hasil);
        }else if(input.equalsIgnoreCase("Pembagian")){
            System.out.print("Masukkan angka pertama: ");
            angka1 = in.nextInt();
            System.out.print("Masukkan angka kedua: ");
            angka2 = in.nextInt();
            int hasil = angka1 / angka2;
            System.out.println("Hasilnya adalah: " + hasil);
        }else{
            System.err.println("Error");
        }
    }
}

