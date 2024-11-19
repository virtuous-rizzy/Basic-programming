package praktikum_soal;
import java.util.Scanner;
public class Praktikum3S1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        int bil = in.nextInt();
            if (bil <= 1) {
            
            }
            else {
                if (bil %2 == 0){
                System.out.println(bil + " merupakan kelipatan 2");
            } else {
                System.out.println(bil + " bukan merupakan kelipatan 2");
            }
            if (bil %3 == 0){
                System.out.println(bil + " merupakan kelipatan 3");
            } else {
                System.out.println(bil + " bukan merupakan kelipatan 3");
            }if (bil %6 == 0){
                System.out.println(bil + " merupakan kelipatan 6");
            } else {
                System.out.println(bil + " bukan merupakan kelipatan 6");
            }if (bil %9 == 0){
                System.out.println(bil + " merupakan kelipatan 9");
            } else {
                System.out.println(bil + " bukan merupakan kelipatan 9");
            }
            }
    }
}
