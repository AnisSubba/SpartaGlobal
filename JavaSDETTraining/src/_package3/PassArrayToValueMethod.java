package _package3;

import java.util.Arrays;

public class PassArrayToValueMethod {

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        int length = result.length;
        // below is the loop to go through the array,
        // and to swap places between on value with the other
        for (int i = 0, j = length-1; i<length; i++ , j--){
            result[j] = list[i];
        }
        return result;
    }
    public static void displayArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args){
        displayArray(reverse(new int[]{3,1,2,4,5,6,4,8,6,3,2}));

    }

}
