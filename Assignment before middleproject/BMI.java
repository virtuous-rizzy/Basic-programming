import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bb, tb, bmi;
        System.out.println("==========BMI CALCULATOR==========");
        System.out.print("Masukkan Berat badan (kg) : ");
        bb = in.nextDouble();
        System.out.print("Masukkan Tinggi badan (m) : ");
        tb = in.nextDouble();
        System.out.println("==================================");
        bmi = bb / (tb * tb);

        if (bmi < 17) {
            System.out.println("Anda kekurangan berat badan tingkat berat");
        } else if (bmi >= 17 && bmi <= 18.5) {
            System.out.println("Anda kekurangan berat badan tingkat ringan");
        } else if (bmi > 18.5 && bmi <= 25) {
            System.out.println("Normal");
        } else if (bmi > 25 && bmi <= 27) {
            System.out.println("Anda kelebihan berat badan tingkat ringan");
        } else if (bmi > 27) {
            System.out.println("Anda kelebihan berat badan tingkat berat");
        }
    }
}
