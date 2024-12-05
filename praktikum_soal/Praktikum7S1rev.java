package praktikum_soal;

import java.util.Scanner;

public class Praktikum7S1rev {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu = 0, kesempatan;
        boolean login = false;
        String nama, nim, daftarnama = "", daftarnim = "";

        while (true) {
            tampilkanMenu();
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    login = true;
                    in.nextLine();
                    System.out.print("Nama : ");
                    daftarnama = in.nextLine();
                    System.out.print("NIM  : ");
                    daftarnim = in.nextLine();
                    System.out.println("Selamat! Anda berhasil mendaftar, silahkan login ulang");
                    break;
                case 2:
                    if (login) {
                        in.nextLine();
                        System.out.print("Nama : ");
                        nama = in.nextLine();
                        System.out.print("NIM  : ");
                        nim = in.nextLine();
                        if (nama.equalsIgnoreCase(daftarnama) && nim.equalsIgnoreCase(daftarnim)) {
                            System.out.println("Selamat " + nama + " dengan nim " + nim + ", Anda berhasil login!");
                            System.exit(0);
                            break;
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
                                    System.exit(0);
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
                                    System.exit(0);
                                    break;
                                } else if (!nama.equalsIgnoreCase(daftarnama) || !nim.equalsIgnoreCase(daftarnim)) {
                                    System.out.println("ANDA SALAH 3X, AKUN ANDA DIBLOKIR");
                                    System.exit(0);
                                    break;
                                }
                            } while (kesempatan <= 1);
                        }
                    } else {
                        tampilkanBelumdaftar();
                    }
                    break;
            }
        }
    }

    public static void tampilkanMenu() {
        System.out.println("Silahkan pilih program menu  \n1.Pendaftaran \n2.Login");
        System.out.print("Pilih menu : ");
    }

    public static void tampilkanBelumdaftar() {
        System.out.println("Maaf Anda belum mendaftar!");
    }
}
