package Perulangan;

public class NestedWhile {

    public static void main(String[] args) {
        int outer = 1;
        while (outer < 3) {
            int inner = 5;
            while (inner < 8) {
                inner++;
                int deepest = 10;
                while (deepest < 14) {
                    System.out.println(outer + " " + inner + " " + deepest);
                    deepest++;
                }
            }
            outer++;
        }
    }

}
