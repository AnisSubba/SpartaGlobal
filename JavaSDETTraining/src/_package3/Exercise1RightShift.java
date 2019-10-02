package _package3;

import java.util.Arrays;

public class Exercise1RightShift {
    public static void main(String[] args) {
        int[] myNumbers = {21,25,64,15,75,12,56,34,2,5,8,41,2,5,45};

        System.out.println(Arrays.toString(myNumbers));

        int temp = myNumbers[myNumbers.length-1];
        for (int i = myNumbers.length-2; i >= 0; i--){
            myNumbers[i+1] =myNumbers[i];
        }
        myNumbers[0] = temp;
        System.out.println(Arrays.toString(myNumbers));
    }
}
