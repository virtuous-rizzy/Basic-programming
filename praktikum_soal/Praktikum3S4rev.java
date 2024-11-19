
package praktikum_soal;
import java.util.Scanner;
public class Praktikum3S4rev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bil1,bil2,hasil;
        
        System.out.println("===========================================");
        System.out.print("Operasi hitung yang ingin dilakukan : \n1.Penjumlahan\n2.Pengurangan\n3.Perkalian\n4.Pembagian\n(1/2/3/4): " );
        int pil = in.nextInt();
        System.out.println("===========================================");
            if (pil == 1) {
            System.out.print("Masukkan angka pertama: ");
            bil1 = in.nextInt();
            System.out.print("Masukkan angka kedua: ");
            bil2 = in.nextInt();
            hasil = bil1+ bil2;
                System.out.println("Maka hasilnya : "+ hasil );
            }
            else if (pil == 2){
            System.out.print("Masukkan angka pertama: ");
            bil1 = in.nextInt();
            System.out.print("Masukkan angka kedua: ");
            bil2 = in.nextInt();
            hasil = bil1 - bil2;
                System.out.println("Maka hasilnya : "+ hasil );
            }else if (pil == 3){
            System.out.print("Masukkan angka pertama: ");
            bil1 = in.nextInt();
            System.out.print("Masukkan angka kedua: ");
            bil2 = in.nextInt();
            hasil = bil1 * bil2;
                System.out.println("Maka hasilnya : "+ hasil );
            }else if (pil == 4){
            System.out.print("Masukkan angka pertama: ");
            bil1 = in.nextInt();
            System.out.print("Masukkan angka kedua: ");
            bil2 = in.nextInt();
            hasil = bil1 / bil2;
                System.out.println("Maka hasilnya : "+ hasil );
            }
            else{
                System.err.println("SYSTEM ERROR");
            }
    }
}
