package Method;

public class Kubus {

    public static void main(String[] args) {
        double s = 5;
        double volume = hitungVolumeLagi(s);
        System.out.println(volume);

        double luasAlas = hitungLuasAlas(s);
        System.out.println(luasAlas);

        hitungVolVoid(s);

        double volumeTigaKubus = 3 * hitungVolumeLagi(s);
    }

    public static double hitungVolume(double sisi) {
        double hasil = Math.pow(sisi, 3); // sisi pangkat 3
        return hasil;
    }

    public static double hitungLuasAlas(double sisi) {
        //double hasil = Math.pow(sisi, 2); //  sisi pangkat 2
        return Math.pow(sisi, 2);
    }

    public static double hitungVolumeLagi(double sisi) {
//        double hasil = hitungLuasAlas(sisi)*sisi;
//        return hasil;
        return hitungLuasAlas(sisi) * sisi; // cara pendek
    }

    public static void hitungVolVoid(double sisi) {
        double hasil = Math.pow(sisi, 3);
        System.out.println(hasil);
    }
}
