package _package2;

import java.util.Scanner;

public class Homework2Reverse {
    public static void reverse(long number){
        StringBuilder myString = new StringBuilder(number + "");
        System.out.println(myString.reverse());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sequence of numbers: ");
        long entry = input.nextInt();
        reverse(entry);
    }
}
