package _package2;

import java.util.Scanner;

public class ReversNumHK {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int reverse = 0;

        while (num != 0){ // until the num is not equal to 0 it will keep on functioning this loop
            int reminder = num % 10; // get the reminder of the num
            reverse = reverse * 10 + reminder; // get the reverse and time by 10 add the reminder. which will become reverse
            num = num / 10; // left number divide by 10, setting the new num
        }
        System.out.println(" Reversed Number: " + reverse);
    }
}
