package _package2;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting3Num {
    public static void displaySortedNumbers(double num1, double num2, double num3) {

//        int num1 = 17;
//        int num2 = 10;
//        int num3 = 15;
//
//        if ((num1 > num2 && num1 > num3)){
//            if (num2> num3){
//                System.out.println(num3 + " " + num2 + " " + num1);
//            }
//            else
//                System.out.println(num2 + " " + num3 + " " + num1);
//        }
//        else if ((num2 > num1 && num2 > num3)){
//            if (num1> num3){
//                System.out.println(num3 + " " + num1 + " " + num2);
//            }
//            else
//                System.out.println(num1 + " " + num3 + " " + num2);
//        }
//        else if ((num3 > num1 && num3 > num1)){
//            if (num1> num2){
//                System.out.println(num2 + " " + num1 + " " + num3);
//            }
//            else
//                System.out.println(num1 + " " + num2 + " " + num3);
//        }
//        else
//            System.out.println("ERROR!");


//        int [] arr = {12, 10, 6};
//        Arrays.sort(arr);
//        System.out.printf("Ascending arr[] : %s", Arrays.toString(arr));

        double[] numberArray = {num1, num2, num3};
        Arrays.sort(numberArray);

        for (double num: numberArray){
            System.out.print(num + ", ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter 3 number: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3); //invoke the method by pass by value
    }

}
