package uts;

import java.util.Scanner;

public class soal4tambah5 {
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
            System.out.println("4. Nilai mahasiswa ");
            System.out.println("================================");
            System.out.print("Pilihan (1/2/3/4) : ");
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
                case 4:
                    System.out.println("====================================");
                    System.out.println("NILAI MAHASISWA ");
                    System.out.print("1. Nama  : ");
                    in.nextLine();
                    String nama1 = in.nextLine();
                    System.out.print("   NIM   : ");
                    String nim1 = in.nextLine();
                    System.out.print("   Nilai : ");
                    int nilai1 = in.nextInt();
                    System.out.println(" ");
                    in.nextLine();

                    System.out.print("2. Nama  : ");
                    String nama2 = in.nextLine();
                    System.out.print("   NIM   : ");
                    String nim2 = in.nextLine();
                    System.out.print("   Nilai : ");
                    int nilai2 = in.nextInt();
                    System.out.println(" ");
                    in.nextLine();

                    System.out.print("3. Nama  : ");
                    String nama3 = in.nextLine();
                    System.out.print("   NIM   : ");
                    String nim3 = in.nextLine();
                    System.out.print("   Nilai : ");
                    int nilai3 = in.nextInt();
                    System.out.println(" ");
                    in.nextLine();

                    System.out.println("================================================================");
                    System.out.println("NIM \t\t Nama \t\t Nilai \t\t Status");
                    String status1, status2, status3;
                    if (nilai1 >= 60) {
                        status1 = "Lulus";
                    } else {
                        status1 = "Tidak Lulus";
                    }
                    if (nilai2 >= 60) {
                        status2 = "Lulus";
                    } else {
                        status2 = "Tidak Lulus";
                    }
                    if (nilai3 >= 60) {
                        status3 = "Lulus";
                    } else {
                        status3 = "Tidak Lulus";
                    }
                    System.out.println(nim1 + "\t\t " + nama1 + "\t\t " + nilai1 + "\t\t " + status1);
                    System.out.println(nim2 + "\t\t " + nama2 + "\t\t " + nilai2 + "\t\t " + status2);
                    System.out.println(nim3 + "\t\t " + nama3 + "\t\t " + nilai3 + "\t\t " + status3);
                    System.out.println("================================================================");
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
