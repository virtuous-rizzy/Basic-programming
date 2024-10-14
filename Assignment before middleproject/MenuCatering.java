import java.util.Scanner;
public class MenuCatering {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("         <<<<<<LAYANAN CATERING AKBAR>>>>>>   ");
        System.out.print("MASUKKAN HARI : ");
        String hari = in.nextLine();
        System.out.println("<<<=============================================>>>");

        switch (hari) {
            case "senin":
                System.out.println("Menu : nasi putih ayam bakar,jus alpukat");
                break;

            case "selasa" :
                System.out.println("Maaf hari selasa kami libur");
                break;

            case "rabu" :
                System.out.println("Menu : Nasi putih ayam goreng, sayur asam, es teh");
                break;

             case "kamis" :
                System.out.println("Menu : Nasi kuning telur,tumis jamur,teh hangat");
                break;

            case "jumat" :
                System.out.println("Maaf hari jumat kami libur");
                break;

            case "sabtu" :
                System.out.println("Menu : Steak ayam, ayam asam manis, jus mangga");
                break;

            case "minggu" :
                System.out.println("Menu : Steak daging, ayam katsu, teh es, teh hangat");
                break;

            default:
                System.out.println("MAAF HARI YANG ANDA INPUT SALAH");
                break;
        }
    }
}
