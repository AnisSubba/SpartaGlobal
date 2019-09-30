package _package1;

import java.util.Arrays;

public class ArrayDemo3 {

    public static void main(String[] args) {

        int[] myArray;
        myArray = new int[10];

        myArray[0] = 100;
        myArray[1] = 200;
        myArray[2] = 300;
        myArray[3] = 400;
        myArray[4] = 500;
        myArray[5] = 600;
        myArray[6] = 700;
        myArray[7] = 800;
        myArray[8] = 900;
        myArray[9] = 1000;

        int[] myThirdArray = Arrays.copyOfRange(myArray, 0, myArray.length);

        for (int i = 0; i < myThirdArray.length; i++){
            System.out.println(myThirdArray[i]);
        }
    }

}
