package _package3;

import java.util.Arrays;
import java.util.Scanner;

public class InitialiseWithNewValues {
    public static void main(String[] args){
        // to declare and create an array
        int[] myList = new int[10];

        // to initialise the array with values from user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++){
            myList[i] = input.nextInt();
        }
        //to display the content of the array, we use the simplest approach
        System.out.println(Arrays.toString(myList));
    }
}
