package _package3;

import java.util.Arrays;

public class ShiftElementLeft {
    public static void main(String[] args) {
        int[] myNumbers = {21,25,64,15,75,12,56,34,2,5,8,41,2,5,45};

        System.out.println(Arrays.toString(myNumbers));

//        to shift the element to the left by 1 place
        int temp = myNumbers[0];
        for (int i = 1; i < myNumbers.length; i++){
            myNumbers[i-1] = myNumbers[i];
        }
        // to shift the first element to be the last element:
        myNumbers[myNumbers.length -1] = temp;

        System.out.println(Arrays.toString(myNumbers));

    }

}
