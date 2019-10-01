package _package2;

import java.util.Arrays;

public class Sorting3Num {
    public static void main(String[] args) {
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
        int [] arr = {12, 10, 6};
        Arrays.sort(arr);
        System.out.printf("Ascending arr[] : %s", Arrays.toString(arr));
    }

}
