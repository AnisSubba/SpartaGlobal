package _package3;

import java.util.Arrays;

public class RandomShuffling {
    public static void main (String[] args){

        int[] myNumberArray = {23,12,5,4,9,12,40,12};

        // to shuffle the array randomly:
        for(int i = 0; i < myNumberArray.length; i++){
            // generate an index j randomly:
            // math.random inherently deals with double to have a index number it not double but integer;
            // convert the double (math.random) to integer but using 'casting' which is (int)
            int j = (int) (Math.random() * myNumberArray.length);

            // to swap my list[i] with mylist[j]
            int temp = myNumberArray[i];
            myNumberArray[i] = myNumberArray[j];
            myNumberArray[j] = temp;

        }
        System.out.println(Arrays.toString(myNumberArray));
    }
}
