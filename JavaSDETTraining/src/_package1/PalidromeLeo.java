package _package1;

import java.util.Scanner;

public class PalidromeLeo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a String: ");
//        String word = sc.nextLine();
//
//        int l = word.length();
//        String rev = "";
//        for (int i = l -1; i >= 0; i--)
//            rev = rev + word.charAt(i);
//        if (word.equals(rev))
//            System.out.println(word + " is a palindrome");
//        else
//            System.out.println(word + " is not a palindrome");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String myPhase = input.nextLine();

        int low = 0;
        int high = myPhase.length() -1;

        boolean isPalindrome = true;
        while (low < high){
            if (myPhase.charAt(low) != myPhase.charAt(high)){
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if (isPalindrome)
            System.out.println(myPhase + "is a palindrome.");
        else
            System.out.println(myPhase + "isnot a palindrome.");

    }
}
