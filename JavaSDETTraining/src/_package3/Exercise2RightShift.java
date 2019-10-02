package _package3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2RightShift {
    public static void main(String[] args) {
        int[] myNumbers = {21,25,64,15,75};

        System.out.println(Arrays.toString(myNumbers));
        int amount = 2;

        for (int i = 0; i < amount; i++){
            int a = myNumbers[myNumbers.length - 1];
            int j;

            for (j = myNumbers.length -1; j> 0; j--)
                myNumbers[j] = myNumbers[j - 1];
            myNumbers[j] = a;
        }
        System.out.println(Arrays.toString(myNumbers));
    }
}
