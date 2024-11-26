package Uap_Pemdas_Akbar;

import java.util.Scanner;

public class PendataanMataPelajaran {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean login = false;
        String reguser = "", regpass = "";
        while (true) {
            System.out.println("      <<=== MENU ===>>");
            System.out.println("1. Registrasi \n2. Login \n3. Keluar");
            System.out.print("Pilih opsi : ");
            int opsi = in.nextInt();
            in.nextLine();
            switch (opsi) {
                case 1:
                    System.out.println("      <<=== REGISTRASI ===>>");
                    System.out.print("username : ");
                    reguser = in.nextLine();
                    System.out.print("password : ");
                    regpass = in.nextLine();
                    System.out.println("Berhasil registrasi, login ulang");
                    login = true;
                    break;
                case 2:
                    if (login) {
                        System.out.println("        <<=== LOGIN ===>>");
                        System.out.print("username : ");
                        String user = in.nextLine();
                        System.out.print("password : ");
                        String pass = in.nextLine();

                        if (reguser.equalsIgnoreCase(user) && regpass.equalsIgnoreCase(pass)) {
                            System.out.println("===================================");
                            System.out.println("Selamat anda berhasil login!");
                            menujadwal();
                        } else {
                            System.err.println("Username/password salah!\n");
                        }
                    } else {
                        System.err.println("Anda harus registrasi dahulu!");
                    }
                    break;
                case 3:
                    System.out.println("Anda keluar dari program.");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void menujadwal() {
        Scanner in = new Scanner(System.in);
        boolean kondisi = true;
        String jadwal = "";
        while (kondisi) {
            System.out.println("\n=== Jadwal Mata Pelajaran ===");
            System.out.println("1. Tambah Jadwal");
            System.out.println("2. Tampilkan Jadwal");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = in.nextInt();

            switch (opsi) {
                case 1:
                    jadwal = tambahkanjadwal(jadwal);
                    break;
                case 2:
                    tampilkanjadwal(jadwal);
                    break;
                case 3:
                    System.out.print("Anda ingin keluar program ? (true/false) : ");
                    boolean proseskeluar = in.nextBoolean();
                    System.out.println(proseskeluar ? "Anda keluar dari program jadwal." : "Anda kembali ke menu utama");
                    if (proseskeluar) {
                        System.exit(0);
                    }

                    break;
                default:
                    System.err.println("MENU INVALID");
                    break;
            }
        }
    }

    public static String tambahkanjadwal(String jadwal) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n  > Tambahkan Jadwal < ");
        System.out.print("Masukkan jumlah mata pelajaran : ");
        int mapel = in.nextInt();
        in.nextLine();

        for (int i = 1; i <= mapel; i++) {
            System.out.print("Masukkan mapel ke-" + i + ": ");
            String input = in.nextLine();

            jadwal += input;
            if (i < mapel) {
                jadwal += ",";
            } else {
                jadwal += ".";
            }
        }

        System.out.println("Jadwal berhasil ditambahkan!");
        return jadwal;
    }

    public static void tampilkanjadwal(String jadwal) {
        System.out.println("  >  Jadwal  < ");
        if (jadwal.equalsIgnoreCase("")) {
            System.err.println("Tidak ada jadwal yang tersedia, silahkan buat jadwal dahulu.");
        } else {
            System.out.println("Jadwal Mata Pelajaran: " + jadwal);
        }
    }
}
