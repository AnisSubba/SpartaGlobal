package _package3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class PassArrayToVoidMethod {
    public static void main(String[] args) {

        int[] myA = {1, 2};
        //to swap elements using the swap method
        System.out.println("Before invoking the swap ");
        System.out.println(Arrays.toString(myA));
        System.out.println("Array is { " + myA[0] + ", " + myA[1] + "}");
        swap(myA[0], myA[1]);
        System.out.println("After invoking the swap ");
        System.out.println("Array is { " + myA[0] + ", " + myA[1] + "}");

    }
    public static void swap(int n1, int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;

    }
}
