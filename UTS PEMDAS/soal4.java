package uts;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("\t LOGIN");
        System.out.print("Username : ");
        String user = in.nextLine();
        System.out.print("Password : ");
        String pass = in.nextLine();
        System.out.println("==========================");

        if (user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("rahasia")) {
            System.out.println("LOGIN BERHASIL! ");
            System.out.println(" ");
            System.out.println("================================");
            System.out.println("PROGRAM 2411016310005");
            System.out.println("================================");
            System.out.println("1. About ");
            System.out.println("2. Operasi Matematika (IF - Soal 2) ");
            System.out.println("3. Operasi Matematika (SWITCH-CASE - Soal 3) ");
            System.out.println("================================");
            System.out.print("Pilihan (1/2/3) : ");
            int pil = in.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("+-----------ABOUT ME-----------+");
                    System.out.println("|Nama : MUHAMMAD RIZKY AKBAR   |");
                    System.out.println("|NIM  : 2411016310005          |");
                    System.out.println("+------------------------------+");
                    break;
                case 2:
                    System.out.print("Pilih operator +,-,*,atau / : ");
                    in.nextLine();
                    String operator = in.nextLine();
                    System.out.print("Bilangan 1 : ");
                    double bil1 = in.nextInt();
                    System.out.print("Bilangan 2 : ");
                    double bil2 = in.nextInt();

                    if (operator.equalsIgnoreCase("+")) {
                        double hasil = bil1 + bil2;
                        System.out.println("Hasil      : " + hasil);
                    } else if (operator.equalsIgnoreCase("-")) {
                        double hasil = bil1 - bil2;
                        System.out.println("Hasil      : " + hasil);
                    } else if (operator.equalsIgnoreCase("*")) {
                        double hasil = bil1 * bil2;
                        System.out.println("Hasil      : " + hasil);
                    } else if (operator.equalsIgnoreCase("/")) {
                        double hasil = bil1 / bil2;
                        System.out.println("Hasil      : " + hasil);
                    } else {
                        System.out.println("OPERATOR YANG ANDA PILIH INVALID");
                    }
                    break;
                case 3:
                    System.out.print("Pilih operator +,-,*,atau / : ");
                    in.nextLine();
                    operator = in.nextLine();
                    System.out.print("Bilangan 1 : ");
                    bil1 = in.nextDouble();
                    System.out.print("Bilangan 2 : ");
                    bil2 = in.nextDouble();

                    switch (operator) {
                        case "+":
                            double hasil = bil1 + bil2;
                            System.out.println("Hasil      : " + hasil);
                            break;
                        case "-":
                            hasil = bil1 - bil2;
                            System.out.println("Hasil      : " + hasil);
                            break;
                        case "*":
                            hasil = bil1 * bil2;
                            System.out.println("Hasil      : " + hasil);
                            break;
                        case "/":
                            hasil = bil1 / bil2;
                            System.out.println("Hasil      : " + hasil);
                            break;
                        default:
                            System.out.println("OPERATOR YANG ANDA PILIH INVALID");
                            break;
                    }
                    break;
                default:
                    System.out.println("PILIHAN TIDAK VALID");
                    break;
            }
        } else {
            System.out.println("LOGIN GAGAL!");
        }
    }
}
