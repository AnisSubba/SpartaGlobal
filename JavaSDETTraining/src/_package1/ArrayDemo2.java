package _package1;

public class ArrayDemo2 {

    public static void main(String[] args){

        int[] myArray;
        myArray =  new int[10];

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

// .length will give the length which already has been set by myArray
        int[] mySecondArray = new int[myArray.length];
        System.arraycopy(myArray, 0, mySecondArray, 0, myArray.length);

// add loop so it start from 0 and smaller than mySecondArray.Length and i++ more
        for (int i = 0; i < mySecondArray.length; i++){
            System.out.println(mySecondArray[i]);
        }

    }
}
