package Method;

import java.util.Scanner;

public class Coobaaw3school {

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Name : ");
        String name = in.nextLine();
        System.out.print("Age : ");
        int age = in.nextInt();
        checkAge(age);

    }
}
