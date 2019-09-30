package _package1;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args){
        char[] myArray;
        myArray = new char[8];

        myArray[0] = 'p';
        myArray[1] = 'a';
        myArray[2] = 's';
        myArray[3] = 's';
        myArray[4] = 'w';
        myArray[5] = 'o';
        myArray[6] = 'r';
        myArray[7] = 'd';

        char[] firstArray = new char[myArray.length];
        System.arraycopy(myArray, 0, firstArray, 0, myArray.length);
//        char[] firstArray = Arrays.copyOfRange(myArray, 0, myArray.length);

        for (char i = 4; i < firstArray.length; i++){
            System.out.println(firstArray[i]);}

    }
}
