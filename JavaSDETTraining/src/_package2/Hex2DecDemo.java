package _package2;

import java.util.Scanner;

public class Hex2DecDemo {
    public static int hexToDecimal(String hex){
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch){
        if(ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Hex Number: ");
        String hex = input.nextLine();
        System.out.println("The decimal Value for the hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }
}
