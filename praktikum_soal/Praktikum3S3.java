package praktikum_soal;
import java.util.Scanner;
public class Praktikum3S3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String regpas,reguser,user,pass;
        System.out.println("+-----------------REGISTRASI---------------------+");
        System.out.print("Registrasi username / email : ");
        reguser = in.nextLine();
        System.out.print("Masukkan password untuk registrasi : ");
        regpas = in.nextLine();
        System.out.println("+-------------------LOGIN-----------------------+");
        System.out.print("Login username / email : ");
        user = in.nextLine();
        System.out.print("Masukkan password : ");
        pass = in.nextLine();
        System.out.println("=================================================");
        
        if (reguser.equalsIgnoreCase(user) && regpas.equalsIgnoreCase(pass)){
            System.out.println("Selamat anda telah berhasil login");
        } else {
            System.err.println("Username/email, atau password anda salah!");
        }
        
    }
}
