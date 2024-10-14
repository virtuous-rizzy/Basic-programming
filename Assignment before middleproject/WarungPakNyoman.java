import java.util.Scanner;
public class WarungPakNyoman {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("+-------------------WARUNG PAK NYOMAN------------------+");
        System.out.print("|Harga makanan : Rp. ");
        int harga = in.nextInt();
        if (harga <= 500){
        System.out.println("|Tidak menjual makanan yang dibawah 500 rupiah      ");
        }
        else if (harga >= 10000){
        System.out.println("|Tidak menjual makanan yang diatas 10000 rupiah     ");
        }
        else if (harga > 500 && harga < 4000) {
        System.out.println("|Kriteria      : Murah                              ");
        }
        else if (harga >= 4000 && harga <= 7500 ) {
        System.out.println("|Kriteria      : Sedang                             ");
        }
        else if (harga > 7500) {
        System.out.println("|Kriteria      : Mahal                              ");
        }
        
        System.out.println("+------------------------------------------------------+");

    }
}
