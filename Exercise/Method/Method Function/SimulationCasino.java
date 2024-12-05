package Method;

import java.util.Scanner;

import java.util.Random;

public class SimulasiMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deposit = 0;
        int mainCount = 0;
        boolean isWin = true;
        while (true) {
            tampilkanMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Masukkan jumlah deposit: ");
                    int amount = scanner.nextInt();
                    deposit = tambahDeposit(deposit, amount);

                    System.out.println("Deposit berhasil.");
                    tampilkanSisaDeposit(deposit);
                    break;
                case 2:
                    tampilkanSisaDeposit(deposit);
                    break;
                case 3:
                    if (deposit <= 0) {
                        System.out.println("Deposit Anda tidak cukup. Silakan isi deposit terlebih dahulu.");
                        break;
                    }
                    System.out.print("Masukkan jumlah uang: ");
                    int main = scanner.nextInt();
                    if (main > deposit) {
                        System.out.println("Tidak valid, karena jumlahnya melebihi deposit.");
                        break;
                    }
                    System.out.print("Tebak angka (1-100): ");
                    int guess = scanner.nextInt();

                    mainCount++;

                    if (aturanMain(mainCount)) {
                        isWin = true;
                    } else {
                        isWin = false;
                    }

                    if (isWin) {
                        System.out.println("Selamat! Anda menang.");
                        deposit = tambahDeposit(deposit, main);

                    } else {
                        System.out.println("Anda kalah.");
                        System.out.print("Angka yang benar adalah ");
                        int angka = tebakAngka(guess);
                        System.out.println(angka);

                        deposit = kurangDeposit(deposit, main);
                    }
                    tampilkanSisaDeposit(deposit);

                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    }

    public static void tampilkanMenu() {
        System.out.println("==== MENU ====");
        System.out.println("1. Isi Deposit");
        System.out.println("2. Cek Sisa Deposit");
        System.out.println("3. Bermain");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void tampilkanSisaDeposit(int deposit) {
        System.out.println("Sisa deposit Anda: " + deposit);
    }

    public static boolean aturanMain(int mainCount) {
        return (mainCount % 10 >= 1 && mainCount % 10 <= 2);
    }

    public static int tebakAngka(int guess) {
        Random rand = new Random();
        int randomNum;
        do {
            //menghasilkan angka random dari 1-100 
            randomNum = rand.nextInt(101);
        } while (randomNum == guess);

        return randomNum;
    }

    public static int tambahDeposit(int deposit, int Uang) {
        deposit += Uang;
        return deposit;
    }

    public static int kurangDeposit(int deposit, int Uang) {
        deposit -= Uang;
        return deposit;
    }

}
