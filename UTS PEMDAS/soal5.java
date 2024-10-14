package uts;

import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("NILAI MAHASISWA ");
        System.out.print("1. Nama  : ");
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

    }
}
