package praktikum_soal;

import java.util.Scanner;

public class Praktikum4S3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tahun,count = 0;
        String bulan,musim;
        System.out.println("================================");
        System.out.println("PROGRAM MUSIM DAN BULAN");
        System.out.print("Bulan : ");
        bulan = in.nextLine();
        System.out.print("Tahun : ");
        tahun = in.nextInt();
        switch (bulan.toLowerCase()){
            case "januari" :
                System.out.println("Pada bulan " + bulan + " " + tahun + " akan dialami musim dingin dengan jumlah hari 31 " );
                break;
            case "desember" :
                System.out.println("Pada bulan " + bulan + " " + tahun + " akan dialami musim dingin dengan jumlah hari 31 " );
                break;
            case "maret" :
                System.out.println("Pada bulan " + bulan + " " + tahun + " akan dialami musim semi dengan jumlah hari 31 ");
                break;
            case "april" :
                System.out.println("Pada bulan " + bulan +" " + tahun + " akan dialami musim semi dengan jumlah hari 30 ");
                break;
            case "mei" :
                System.out.println("Pada bulan " + bulan + " " + tahun + " akan dialami musim semi dengan jumlah hari 31 ");
                break;
            case "juni" :
                System.out.println("Pada bulan " + bulan + " " + tahun + " akan dialami musim panas dengan jumlah hari 30 ");
                break;
            case "september" :
                System.out.println("Pada bulan " + bulan + " " + tahun + " akan dialami musim gugur dengan jumlah hari 30 ");
                break;
            case "juli" :
                System.out.println("Pada bulan " + bulan + " " +tahun + " akan dialami musim panas dengan jumlah hari 31 ");
                break;
            case "agustus" :
                System.out.println("Pada bulan " + bulan + " " + tahun + " akan dialami musim panas dengan jumlah hari 31 ");
                break;
             case "november" :
                System.out.println("Pada bulan " + bulan +  " " + tahun + " akan dialami musim gugur dengan jumlah hari 31 ");
                break;
            case "oktober" :
                System.out.println("Pada bulan " + bulan +" " + tahun + " akan dialami musim gugur dengan jumlah hari 31 ");
                break;
            case "februari" :
                count += tahun % 4 == 0 ? 29 : 28;
                System.out.println("Pada bulan " + bulan +" " + tahun + " akan dialami musim dingin dengan jumlah hari " + count );
                break;
            default :
                System.err.println("INPUT INVALID !");
        }
    }
    
}
