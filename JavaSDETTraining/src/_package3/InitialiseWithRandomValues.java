package _package3;

import java.util.Arrays;

public class InitialiseWithRandomValues {
    public static void main(String[] args){
        // to declare and create the array
        double[] mylist = new double[5];

        // to initialise the array with random numbers
        for (int i = 0; i < mylist.length; i++){
            mylist[i] = Math.round(Math.random() * 100);

        }
        // to display the content of the array
        System.out.println(Arrays.toString(mylist));
    }
}
