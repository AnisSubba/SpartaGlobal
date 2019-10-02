package _package3;

public class FindSmallestIndexOfLargestElement {
    public static void main(String[] args) {

        // we are using array initialise:
        // count its way to the largest number
        // 9 is the largest number and it is 3 step ahead as 0.1.2.3
        int[] myNumberArray = {2,5,7,9,3,1,5,6,3,7};

        // to find the smallest index of the largest element:
        int max = myNumberArray[0];
        int indexOfMax = 0;

        for (int i = 0; i < myNumberArray.length; i++){
            if(myNumberArray[i] > max) {
                max = myNumberArray[i];
                indexOfMax = i;
            }
        }
        System.out.println(indexOfMax);
    }
}
