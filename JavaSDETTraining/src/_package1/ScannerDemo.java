package _package1;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Phrase: ");
        String myPhrase = input.nextLine();
        System.out.println(myPhrase);
    }
}
