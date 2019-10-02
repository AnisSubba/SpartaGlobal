package _package3;

public class EnumarateEachElement {
    public static void main(String[] args) {
        // declare and create a array
        double[] myList = new double[5];

        // to initialise the array with random number
        for (int i = 0; i < myList.length; i++){
            myList[i] = Math.round(Math.random()* 100);
        }

        // to display the array by showing each element:
        for (int i = 0; i < myList.length; i++){
            System.out.println(myList[i] + " ");
        }

    }

}
