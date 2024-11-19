package praktikum_soal;

import java.util.Scanner;

public class Praktikum7S1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kondisi = 0, menu = 0;

        do {
            if (menu == 2) {
                menu2();
            }
            System.out.println("Silahkan pilih program menu  \n1.Pendaftaran \n2.Login");
            System.out.print("Pilih menu : ");
            menu = in.nextInt();

            if (menu == 1) {
                menu1();
                break;
            }

        } while (kondisi <= 2);

    }

    static void menu1() {
        Scanner in = new Scanner(System.in);
        String daftarnama, daftarnim, nama, nim;
        int kesempatan, kondisi = 0;

        System.out.print("Nama : ");
        daftarnama = in.nextLine();
        System.out.print("NIM  : ");
        daftarnim = in.nextLine();
        System.out.println("Selamat! Anda berhasil mendaftar, silahkan login ulang");
        System.out.println("Silahkan pilih program menu  \n1.Pendaftaran \n2.Login");
        System.out.print("Pilih menu : ");
        in.nextLine();

        System.out.print("Nama : ");
        nama = in.nextLine();
        System.out.print("NIM  : ");
        nim = in.nextLine();
        if (nama.equalsIgnoreCase(daftarnama) && nim.equalsIgnoreCase(daftarnim)) {
            System.out.println("Selamat " + nama + " dengan nim " + nim + ", Anda berhasil login!");

        } else {
            kesempatan = 2;
            do {
                if (!nama.equalsIgnoreCase(daftarnama) || !nim.equalsIgnoreCase(daftarnim)) {
                    System.out.println("Login gagal!, kesempatan login " + kesempatan + "X lagi");
                    System.out.print("Nama : ");
                    nama = in.nextLine();
                    System.out.print("NIM  : ");
                    nim = in.nextLine();
                }
                if (nama.equalsIgnoreCase(daftarnama) && nim.equalsIgnoreCase(daftarnim)) {
                    System.out.println("Selamat " + nama + " dengan nim " + nim + ", Anda berhasil login!");
                    break;
                } else if (!nama.equalsIgnoreCase(daftarnama) || !nim.equalsIgnoreCase(daftarnim)) {
                    kesempatan--;
                    System.out.println("Login gagal!, kesempatan login " + kesempatan + "X lagi");
                }
                System.out.print("Nama : ");
                nama = in.nextLine();
                System.out.print("NIM  : ");
                nim = in.nextLine();
                if (nama.equalsIgnoreCase(daftarnama) && nim.equalsIgnoreCase(daftarnim)) {
                    System.out.println("Selamat " + nama + " dengan nim " + nim + ", Anda berhasil login!");
                    break;
                } else if (!nama.equalsIgnoreCase(daftarnama) || !nim.equalsIgnoreCase(daftarnim)) {
                    System.out.println("ANDA SALAH 3X, AKUN ANDA DIBLOKIR");
                    break;

                }
            } while (kesempatan <= 1);
        }

    }

    static void menu2() {
        System.out.println("Maaf anda belum mendaftar!");
    }
}
