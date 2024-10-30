package Perulangan;

public class LatihanSoal3 {

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 15; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i + " adalah Kelipatan Dua dan Tiga");
            } else if (i % 2 == 0) {
                System.out.println(i + " adalah Kelipatan Dua");
            } else if (i % 3 == 0) {
                System.out.println(i + " adalah Kelipatan Tiga");
            } else if (i % 5 == 0) {
                System.out.println(i + " adalah Kelipatan Lima");
            } else {
                System.out.println(i);
            }
        }
    }

}
