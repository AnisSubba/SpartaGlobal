package _package1;

public class Exercise4 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 2 * (5 - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
