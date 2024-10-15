import java.util.Scanner;

public class KasusSwitchKendaraan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total, tahun, tarif = 0;
        System.out.println("======================================");
        System.out.println("\t PENGHITUNG PAJAK");
        System.out.print("Jenis Kendaraan : ");
        String tipe = in.nextLine();
        System.out.print("Tahun pembuatan : ");
        tahun = in.nextInt();

        switch (tipe.toLowerCase()) {
            case "motor":
                tarif += 1000000;
                break;
            case "mobil":
                tarif += 3000000;
                break;
            case "truk":
                tarif += 5000000;
                break;
            default:
                System.out.println("KENDARAAN YANG ANDA PILIH SALAH");
                break;
        }
        if (tahun < 2014) {
            total = tarif - (tarif * 2 / 10);
            System.out.println("Pajak           : Rp. " + total);
        } else if (tahun >= 2014 && tahun <= 2019) {
            total = tarif - (tarif * 10 / 100);
            System.out.println("Pajak           : Rp. " + total);
        } else {
            total = tarif;
            System.out.println("Pajak           : Rp. " + total);
        }
        System.out.println("======================================");
        in.close();
    }
}
