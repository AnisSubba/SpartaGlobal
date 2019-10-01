package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String word = sc.nextLine();

        int l = word.length();
        String rev = "";
        for (int i = l -1; i >= 0; i--)
            rev = rev + word.charAt(i);
        if (word.equals(rev))
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");

    }
}
