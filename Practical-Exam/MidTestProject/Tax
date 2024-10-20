package BelajarPraktikum.utp;

import java.util.Scanner;

public class soal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("=============REGISTRASI============");
        System.out.print("username : ");
        String reguser = in.nextLine();
        System.out.print("password : ");
        String regpass = in.nextLine();
        System.out.println("===============LOGIN===============");
        System.out.print("username : ");
        String user = in.nextLine();
        System.out.print("password : ");
        String pass = in.nextLine();
        System.out.println("===================================");

        if (reguser.equalsIgnoreCase(user) && regpass.equalsIgnoreCase(pass)) {
            System.out.println("LOGIN BERHASIL! ");
            System.out.println("\n\n \t PENGELOLAAN PAJAK PER TAHUN");
            final int ptkptdkkawin = 54000000;
            final int ptkpkawin = 58500000;
            final int ptkpkawinanak = 63000000;
            double ptkp;
            double pajak = 0;
            System.out.println("=============================================");
            System.out.print("Nama : ");
            String nama = in.nextLine();
            System.out.print("Apakah anda sudah menikah ? (y/n) : ");
            char nikah = in.next().charAt(0);
            switch (nikah) {
                case 'y':
                    System.out.print("Apakah anda memiliki anak ? (true/false) : ");
                    boolean anak = in.nextBoolean();
                    ptkp = anak ? ptkpkawinanak : ptkpkawin;
                    break;
                default:
                    ptkp = ptkptdkkawin;
            }
            System.out.print("Jumlah penghasilan per tahun : ");
            float penghasilan = in.nextFloat();
            int pkp = (int) (penghasilan - ptkp);
            if (pkp > 0) {
                if (pkp <= 60000000) {
                    pajak = pkp * 0.05;
                } else if (pkp <= 250000000) {
                    pajak = (60000000 * 0.05) + ((pkp - 60000000) * 0.15);
                } else if (pkp <= 500000000) {
                    pajak = (60000000 * 0.05) + (190000000 * 0.15) + ((pkp - 250000000) * 0.25);
                } else {
                    pajak = (60000000 * 0.05) + (190000000 * 0.15) + (250000000 * 0.25) + ((pkp - 500000000) * 0.30);
                }
                System.out.println("\n\n=============== RINCIAN PAJAK ================");
                System.out.println("Nama                               : " + nama);
                System.out.printf("Penghasilan per Tahun              : Rp. %,.0f\n", penghasilan);
                System.out.printf("Penghasilan Tidak Kena Pajak (PTKP): Rp. %,.0f\n", ptkp);
                System.out.printf("Penghasilan Kena Pajak (PKP)       : Rp. %,d\n", pkp);
                System.out.printf("Maka pajak Anda per Tahun sebesar  : Rp. %,.0f\n", pajak);
            } else {
                System.out.println("\n\n =============== RINCIAN PAJAK ================");
                System.out.println("Nama                               : " + nama);
                System.out.printf("Penghasilan per Tahun              : Rp. %,.0f\n", penghasilan);
                System.out.println("Anda tidak dikenakan tarif pajak");
            }
        } else {
            System.err.println("Username/password salah! ");
        }

    }
}
