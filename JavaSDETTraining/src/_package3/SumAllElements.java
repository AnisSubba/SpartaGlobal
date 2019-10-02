package _package3;

import java.util.Arrays;

public class SumAllElements {
    public static void main(String[] args) {

        // to store the sum, we create a variable
        double total = 0;

        // declare and create an new array
        double[] mylist = new double[5];

        for (int i = 0; i < mylist.length; i++){
            mylist[i] = Math.round(Math.random() * 100);
        }

        System.out.println(Arrays.toString(mylist));

        // to sum up all elements of this array:
        for (int i = 0; i < mylist.length; i++){
            total += mylist[i];
        }

        // to display the sum is to display the total variable:
        System.out.println("\n" + total);
    }
}
