import java.util.Scanner;

public class ProgramMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("<<<<<<<<<<PROGRAM MENU>>>>>>>>>>");
        System.out.println("1. Program Menu Katering");
        System.out.println("2. Warung Pak Nyoman");
        System.out.println("3. Body Massa Indeks(BMI)");
        System.out.println("4. About");
        System.out.print("Pilih menu yang diinginkan : ");
        int pil = in.nextInt();

        switch (pil) {
            case 1:
                System.out.println("         <<<<<<LAYANAN CATERING AKBAR>>>>>>   ");
                System.out.print("MASUKKAN HARI : ");
                in.nextLine();
                String hari = in.nextLine();
                System.out.println("<<<=============================================>>>");

                switch (hari.toLowerCase()) {
                    case "senin":
                        System.out.println("Menu : nasi putih ayam bakar,jus alpukat");
                        break;

                    case "selasa":
                        System.out.println("Maaf hari selasa kami libur");
                        break;

                    case "rabu":
                        System.out.println("Menu : Nasi putih ayam goreng, sayur asam, es teh");
                        break;

                    case "kamis":
                        System.out.println("Menu : Nasi kuning telur,tumis jamur,teh hangat");
                        break;

                    case "jumat":
                        System.out.println("Maaf hari jumat kami libur");
                        break;

                    case "sabtu":
                        System.out.println("Menu : Steak ayam, ayam asam manis, jus mangga");
                        break;

                    case "minggu":
                        System.out.println("Menu : Steak daging, ayam katsu, teh es, teh hangat");
                        break;

                    default:
                        System.out.println("MAAF HARI YANG ANDA INPUT SALAH");
                }
                break;
            case 2:
                System.out.println("+-------------------WARUNG PAK NYOMAN------------------+");
                System.out.print("|Harga makanan : Rp. ");
                int harga = in.nextInt();
                if (harga <= 500) {
                    System.out.println("|Tidak menjual makanan yang dibawah 500 rupiah         |");
                } else if (harga >= 10000) {
                    System.out.println("|Tidak menjual makanan yang diatas 10000 rupiah        |");
                } else if (harga > 500 && harga < 4000) {
                    System.out.println("|Kriteria      : Murah                                 |");
                } else if (harga >= 4000 && harga <= 7500) {
                    System.out.println("|Kriteria      : Sedang                                |");
                } else if (harga > 7500) {
                    System.out.println("|Kriteria      : Mahal                                 |");
                } else {
                    System.err.println("MAAF INPUT YANG ANDA MASUKKAN SALAH!");
                }

                System.out.println("+------------------------------------------------------+");
                break;
            case 3:
                double bb, tb, bmi;
                System.out.println("==========BMI CALCULATOR==========");
                System.out.print("Masukkan Berat badan (kg) : ");
                bb = in.nextDouble();
                System.out.print("Masukkan Tinggi badan (m) : ");
                tb = in.nextDouble();
                System.out.println("==================================");
                bmi = bb / (tb * tb);

                if (bmi < 17) {
                    System.out.println("Anda kekurangan berat badan tingkat berat");
                } else if (bmi >= 17 && bmi <= 18.5) {
                    System.out.println("Anda kekurangan berat badan tingkat ringan");
                } else if (bmi > 18.5 && bmi <= 25) {
                    System.out.println("Normal");
                } else if (bmi > 25 && bmi <= 27) {
                    System.out.println("Anda kelebihan berat badan tingkat ringan");
                } else if (bmi > 27) {
                    System.out.println("Anda kelebihan berat badan tingkat berat");
                }
                break;
            case 4 :
            System.out.println("+-----------ABOUT ME-----------+");
            System.out.println("|Nama : MUHAMMAD RIZKY AKBAR   |");
            System.out.println("|NIM  : 2411016310005          |");
            System.out.println("+------------------------------+");

            default:
                System.err.println("MAAF INPUT TIDAK VALID");
                break;
        }
    }
}
