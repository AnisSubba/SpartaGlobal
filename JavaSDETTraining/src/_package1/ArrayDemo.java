package _package1;

public class ArrayDemo {

    public static void main (String[] args){

        // declare an array of integers
        int[] myArray;

        // Create an array with new operator
        // Allocate memory for 10 integers
        myArray = new int[10];

//        int[] myArray2 = new int[20];
//        initialise the first element
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

        System.out.println("Element at index 0 :" + myArray[0]);
        System.out.println("Element at index 1 :" + myArray[1]);
        System.out.println("Element at index 2 :" + myArray[2]);
        System.out.println("Element at index 3 :" + myArray[3]);
        System.out.println("Element at index 4 :" + myArray[4]);
        System.out.println("Element at index 5 :" + myArray[5]);
        System.out.println("Element at index 6 :" + myArray[6]);
        System.out.println("Element at index 7 :" + myArray[7]);
        System.out.println("Element at index 8 :" + myArray[8]);
        System.out.println("Element at index 9 :" + myArray[9]);

    }
}
