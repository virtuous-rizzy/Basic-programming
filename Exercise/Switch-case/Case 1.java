package BelajarPraktikum;

import java.util.Scanner;

public class Switch1coba {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lampu;
        System.out.print("Inputkan nama warna lampu : ");
        lampu = in.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, hati-hati!");
                break;
            case "hijau":
                System.out.println("Warna hijau, jalan!");
            default:
                System.err.println("MAAF WARNA YANG ANDA INPUT SALAH");
        }
    }
}
