package _package3;

import java.util.Arrays;

public class FindLargestElement {
    public static void main(String[] args) {

        double[] mylist = new double[8];

        for (int i = 0; i < mylist.length; i++){
            mylist[i] = Math.round(Math.random() * 100);
        }
        System.out.println(Arrays.toString(mylist));

        double max = mylist[0];
        for(int i = 0; i < mylist.length; i++){
            if(mylist[i] > max) max = mylist[i];
        }
        System.out.println("\n" + max);
    }
}
